package com.iammybest.springcloud.internal;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/24 22:01
 * @AUTHOR: qinghai.deng
 **/
@RestController
@RequestMapping("internal/account")
public class CdpCheckTokenController {
    @GetMapping("/checkToken")
    public CdpResponse checkToken(@RequestParam("authorization")String authorization,
                                  @RequestParam("appkey")String appkey,
                                  @RequestParam("digitalSign")String digitalSign,
                                  @RequestParam("signTimestamp")String signTimestamp,
                                  @RequestParam("nonce")String nonce) {
        Random random =new Random();
        if((random.nextInt()%2)==1){
            CdpResponse response = new CdpResponse();
            response.setReturnStatus(CdpResponse.Status.SUCCEED);
            return new CdpResponse();
        }else{
            CdpResponse response = new CdpResponse();
            response.setReturnStatus(CdpResponse.Status.FAILED);
            return response;
        }
    }
}
