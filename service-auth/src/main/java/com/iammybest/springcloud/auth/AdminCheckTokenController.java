package com.iammybest.springcloud.auth;

import com.timanetworks.tsf.core.response.Response;
import com.timanetworks.tsf.core.token.CheckTokenResponse;
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
@RequestMapping("internal/adminToken")
public class AdminCheckTokenController {
    @GetMapping("/checkToken")
    public CheckTokenResponse checkToken(@RequestParam("token")String authorization) {
        Random random =new Random();
        if((random.nextInt()%2)==1){
            return new CheckTokenResponse();
        }else{
            return new CheckTokenResponse(AuthGatewayError.TOKEN_AUTH_FAILED);
        }
    }
}
