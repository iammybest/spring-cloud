package com.iammybest.springcloud.db.mybatis.service;

import com.iammybest.springcloud.db.mybatis.dao.UserDAO;
import com.iammybest.springcloud.db.mybatis.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Timer;

/**
 * @Author 邓清海
 * @Date 2017/11/9 11:15
 * Description:
 */
@Service
public class UserService {

    @Autowired
    UserDAO userDAO;
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
    public void login(Integer id,String psw) {
        userDAO.get(id);
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setCreateTime(new Date());
        userDAO.updateLoginTime(userEntity);
        int temp = 1 / Integer.valueOf(psw);
    }
}
