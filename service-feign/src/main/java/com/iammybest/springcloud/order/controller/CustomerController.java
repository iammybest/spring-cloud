package com.iammybest.springcloud.order.controller;

import com.iammybest.springcloud.order.feign.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

//    @Value("${foo}")
//    String foo;

    @Autowired
    private ServiceOrder serviceOrder;

    //    @Autowired
//    private ServicePay servicePay;
    @RequestMapping(value = "/order/create", method = RequestMethod.GET)
    public String createOrder(@RequestParam String productId) {
        return serviceOrder.createOrder(getSessionUserName(), productId) + " Running on " /*+ foo*/;
    }

    @RequestMapping(value = "/pay/payOrder", method = RequestMethod.GET)
    public String payOrder(@RequestParam String orderId) {
        return serviceOrder.payOrder(getSessionUserName(), orderId) + " Running on " /*+ foo*/;
    }

    private String getSessionUserName() {
        return "feign customer";
    }
}
