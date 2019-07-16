package com.iammybest.springcloud.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务消费方
 */
//指定 服务  value
//fallback = ServiceOrderHystric.class 断路处理
@FeignClient(value = "service-pay", fallback = ServicePayHystric.class)
public interface ServicePay {

    @RequestMapping(value = "/api/order/create", method = RequestMethod.GET)
    String createOrder(@RequestParam(value = "name") String name, @RequestParam(value = "productId") String productId);

    @RequestMapping(value = "/api/pay/order", method = RequestMethod.GET)
    String payOrder(@RequestParam(value = "name") String name, @RequestParam(value = "orderId") String orderId);
}
