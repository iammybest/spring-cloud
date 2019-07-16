package com.iammybest.spring.kafka;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaOperations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

@Component
public class MsgProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String msg) {
        send(topic, null, msg);
    }

    public void send(String topic, String key, String msg) {

        if (key == null || "".equals(key)) {

        kafkaTemplate.send(topic,msg);
        } else {
            kafkaTemplate.send(topic, key, msg);
        }


        kafkaTemplate.metrics();

        kafkaTemplate.execute(new KafkaOperations.ProducerCallback<String, String, Object>() {
            public Object doInKafka(Producer<String, String> producer) {
                //这里可以编写kafka原生的api操作
                System.out.println("doInKafka");
                return null;
            }
        });

        //消息发送的监听器，用于回调返回信息
        kafkaTemplate.setProducerListener(new ProducerListener<String, String>() {

            public void onSuccess(String s, Integer integer, String s2, String s3, RecordMetadata recordMetadata) {
                System.out.println("send success " + s);
                System.out.println(recordMetadata);
            }

            public void onError(String topic, Integer partition, String key, String value, Exception exception) {
                System.out.println("send onError " + topic + " " + exception.getMessage());
                System.out.println(partition);
                System.out.println(key);
                System.out.println(value);
            }

            public boolean isInterestedInSuccess() {
                return false;
            }
        });
    }
}
