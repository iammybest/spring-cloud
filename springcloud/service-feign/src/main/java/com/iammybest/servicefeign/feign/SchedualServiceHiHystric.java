package com.iammybest.servicefeign.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHelloWord {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}