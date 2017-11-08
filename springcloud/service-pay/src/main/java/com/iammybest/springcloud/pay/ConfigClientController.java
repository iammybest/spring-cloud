package com.iammybest.springcloud.pay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/conf/foo")
    public String foo() {
        return foo + new Date().toString();
    }
}