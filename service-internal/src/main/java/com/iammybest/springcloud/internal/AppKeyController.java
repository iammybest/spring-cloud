package com.iammybest.springcloud.internal;

import com.iammybest.springcloud.commons.RestResponse;
import com.iammybest.springcloud.commons.ServerInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/24 14:28
 * @AUTHOR: qinghai.deng
 **/
@RestController
@RequestMapping("internal/app")
public class AppKeyController {

    @PostMapping("/checkSignNew")
    public AppCheckSignResponse config() {
        Random random =new Random();
        if((random.nextInt()%2)==1){
            return new AppCheckSignResponse();
        }else{
            return new AppCheckSignResponse(ApiGatewayError.SIGNATURE_VALIDATION_FAILED);
        }
    }
}
