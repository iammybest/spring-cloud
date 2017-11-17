package com.iammybest.springcloud.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 配置服务中心
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
//@RestController
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
//
//	@Value("${foo}")
//	String foo;
//	@RequestMapping(value = "/conf/foo")
//	public String foo() {
//		return foo + new Date().toString();
//	}
}
