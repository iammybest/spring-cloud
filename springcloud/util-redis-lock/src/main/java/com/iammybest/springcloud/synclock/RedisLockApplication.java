package com.iammybest.springcloud.synclock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 路由网关
 */
@SpringBootApplication
@RestController
public class RedisLockApplication {

//	@Autowired
//	ThreadLockTest threadLockTest;
	public static void main(String[] args) {
		SpringApplication.run(RedisLockApplication.class, args);
	}
//	@RequestMapping("lock")
//	public void testRedisLock(){
//		threadLockTest.testLock();
//	}
}
