package com.iammybest.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@EnableKafka
@RestController
@RequestMapping("/kafka")
public class UtilKafkaApplication {

    @Autowired
    MsgProducer msgProducer;

    public static void main(String[] args) {
        SpringApplication.run(UtilKafkaApplication.class, args);
    }

    @RequestMapping("/send")
    public String sendKafkaMsg(@RequestParam("key") String key, @RequestParam("msg") String msg) {
        System.out.println("***********************");
        System.out.println("key"+key+"msg " + msg);
        msgProducer.send("deng", key, msg);
        return "send " + new Date();
    }
}
