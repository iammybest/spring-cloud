package com.iammybest.springcloud.internal;

import com.iammybest.springcloud.commons.RestResponse;
import com.iammybest.springcloud.commons.ServerInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/24 0:42
 * @AUTHOR: qinghai.deng
 **/
@RestController
@RequestMapping("/api")
public class Service {
    @Value("${server.port}")
    Integer port;
    @Value("${spring.application.name}")
    String serverName;
    @Value("${internal.version}")
    String version;


    @RequestMapping("/conf")
    public RestResponse config() {
        return new RestResponse().setCode(1000).setMsg("success").setData(new ServerInfo(port, serverName).setVersion(version));
    }
}
