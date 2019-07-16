package com.iammybest.springboot.hbase;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class UtilHbaseApplication {

	public static void main(String[] args) {

//		SpringApplication.run(UtilHbaseApplication.class, args);

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/hbase-spring.xml", UtilHbaseApplication.class);
//		log.info("HBase Application Running");
		context.registerShutdownHook();
	}


}
