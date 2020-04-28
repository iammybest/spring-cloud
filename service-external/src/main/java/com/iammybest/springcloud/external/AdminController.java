package com.iammybest.springcloud.external;

import com.iammybest.springcloud.commons.RestResponse;
import com.timanetworks.tsf.core.token.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIBE:
 * @TIME: 2020/4/27 10:33
 * @AUTHOR: qinghai.deng
 **/
@RestController
@RequestMapping("admin/api")
@Slf4j
public class AdminController {
    @GetMapping("/conf")
    public RestResponse config() {
        log.info("***********AdminController******************{}", TokenUtil.getAid());
        return new RestResponse().setCode(1000).setMsg("success");
    }
}
