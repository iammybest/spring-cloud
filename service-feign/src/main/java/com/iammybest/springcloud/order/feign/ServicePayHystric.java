package com.iammybest.springcloud.order.feign;

import org.springframework.stereotype.Component;

@Component
public class ServicePayHystric implements ServicePay {
    @Override
    public String createOrder(String name, String productId) {
        return "fuck! Server down I cannot work for you: " + name+" product "+productId;
    }

    @Override
    public String payOrder(String name, String orderId) {
        return "fuck! Server down I cannot work for you: " + name+" orderId "+orderId;
    }
}