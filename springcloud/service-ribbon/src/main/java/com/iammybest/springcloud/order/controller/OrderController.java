package com.iammybest.springcloud.order.controller;

import com.iammybest.springcloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return orderService.hiService(name);
    }
}
