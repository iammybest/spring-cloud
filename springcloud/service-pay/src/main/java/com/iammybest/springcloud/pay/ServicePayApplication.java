package com.iammybest.springcloud.pay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/api")
@RefreshScope
public class ServicePayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePayApplication.class, args);
	}
//	@Value("${foo}")
//	String foo;
	@Value("${server.port}")
	String port;

	@RequestMapping("/order/create")
	public String home(@RequestParam(name = "name") String name, @RequestParam(name = "productId") String productId) {
		return "hi " + name + ", You succeeded in buying product :" + productId +" ! service is on port:"+port +" on "+new Date().toString();
	}

	@RequestMapping("/pay/payOrder")
	public String pay(@RequestParam String name, @RequestParam String orderId) {
		return "hi " + name + ", You succeeded in paying order ID:" + orderId +" ! service is on port:"+port  +" on "+new Date().toString();
	}

}
//@SpringBootApplication
//@RestController
//public class ServicePayApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServicePayApplication.class, args);
//	}
//
////	@Value("${foo}")
////	String foo;
//
//	@RequestMapping(value = "/foo")
//	public String foo(){
//		return foo;
//	}
//}



