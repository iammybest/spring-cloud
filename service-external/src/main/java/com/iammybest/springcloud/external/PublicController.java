package com.iammybest.springcloud.external;

import com.iammybest.springcloud.commons.RestResponse;
import com.iammybest.springcloud.commons.ServerInfo;
import com.timanetworks.audi.core.token.CdpTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @author 邓清海
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 对外提供 服务
 * @date 2017/11/17
 * @Time 18:09
 */
@RestController
@RequestMapping("public/api")
@Slf4j
public class PublicController {

    /**
     * 远程配置服务器上获取配置
     */
    @Value("${version}")
    String version;

    /**
     * 本地配置文件中获取 配置属性
     */
    @Value("${server.port}")
    Integer port;
    @Value("${spring.application.name}")
    String serverName;

    @Resource
    RestTemplate restTemplate;

    @GetMapping("conf")
    public RestResponse config() {
        log.info("***********PublicController******************{}", CdpTokenUtil.getCdpToken().getAid());
        return new RestResponse().setCode(1000).setMsg("success").setData(new ServerInfo(port, serverName).setVersion(version));
    }

    @GetMapping("/internal/conf")
    public RestResponse internalConfig() {
        /**
         * 调用服务接口
         */
        return restTemplate.getForObject("http://SERVICE-INTERNAL/service-internal/api/conf", RestResponse.class);
    }
}
