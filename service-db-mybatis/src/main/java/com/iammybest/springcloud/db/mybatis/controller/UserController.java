package com.iammybest.springcloud.db.mybatis.controller;

import com.iammybest.springcloud.db.mybatis.dao.UserDAO;
import com.iammybest.springcloud.db.mybatis.entity.UserEntity;
import com.iammybest.springcloud.db.mybatis.filter.LogFilter;
import com.iammybest.springcloud.db.mybatis.service.UserService;
import com.iammybest.springcloud.db.mybatis.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author 邓清海
 * @Date 2017/11/9 11:01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserDAO userDAO;
    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public UserVo get(@RequestParam("id") Integer id) {
        logger.info("request date :"+new Date());
        return userDAO.get(id);
    }


    @RequestMapping("/login")
    public void login(@RequestParam("id")Integer id,@RequestParam("psw")String psw) {
        userService.login(id,psw);
    }
}
