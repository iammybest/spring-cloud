
package com.iammybest.springcloud.internal;

import com.iammybest.springcloud.commons.RestResponse;
import com.iammybest.springcloud.commons.ServerInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/api")
public class ServiceInternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceInternalApplication.class, args);
    }

    @Value("${server.port}")
    Integer port;
    @Value("${spring.application.name}")
    String serverName;
    @Value("${version}")
    String version;


    @RequestMapping("/conf")
    public RestResponse config() {

        return new RestResponse().setCode(1000).setMsg("success").setData(new ServerInfo(port, serverName).setVersion(version));
    }
}

