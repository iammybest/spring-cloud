//
package com.iammybest.springcloud.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置客户端
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ServiceExternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceExternalApplication.class, args);
    }

}

