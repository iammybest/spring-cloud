package com.iammybest.springcloud.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/api")
public class ServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/order/create")
    public String home(@RequestParam String name,@RequestParam String productId) {
        return "hi " + name + ", You succeeded in buying product :" + productId +" ! service is on port:"+port;
    }

    @RequestMapping("/pay/payOrder")
    public String pay(@RequestParam String name, @RequestParam String orderId) {
        return "hi " + name + ", You succeeded in paying order ID:" + orderId +" ! service is on port:"+port;
    }
}
