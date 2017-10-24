package com.iammybest.springcloud.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHelloWord {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}