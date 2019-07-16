package com.iammybest.springcloud.synclock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RedisLockHandler {
    private static final Logger logger = LoggerFactory.getLogger(RedisLockHandler.class);
    // 存储到redis中的锁标志
    private static final String LOCKED = "LOCKED";

    // 请求锁的超时时间(ms)
    private static final long TIME_OUT = 30000;

    // 锁的有效时间(s)
    public static final int EXPIRE = 60;

    @Autowired
    private StringRedisTemplate redisTemplate;

}
