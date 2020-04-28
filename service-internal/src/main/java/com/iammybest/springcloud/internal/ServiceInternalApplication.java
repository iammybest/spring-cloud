
package com.iammybest.springcloud.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceInternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceInternalApplication.class, args);
    }

}

