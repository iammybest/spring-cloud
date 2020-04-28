package com.iammybest.springcloud.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/24 22:01
 * @AUTHOR: qinghai.deng
 **/
@RestController
@RequestMapping("internal/cdp")
public class CdpCheckTokenController {
    @GetMapping("/checkToken")
    public CdpResponse checkToken(@RequestParam("authorization")String authorization,
                                  @RequestParam("appkey")String appkey,
                                  @RequestParam("digitalSign")String digitalSign,
                                  @RequestParam("signTimestamp")String signTimestamp,
                                  @RequestParam("nonce")String nonce) {
//        Random random =new Random();
//        if((random.nextInt()%2)==1){
            CdpResponse response = new CdpResponse();
            response.setReturnStatus(CdpResponse.Status.SUCCEED);
            return response;
//        }else{
//            CdpResponse response = new CdpResponse();
//            response.setReturnStatus(CdpResponse.Status.FAILED);
//            return response;
//        }
    }
}
