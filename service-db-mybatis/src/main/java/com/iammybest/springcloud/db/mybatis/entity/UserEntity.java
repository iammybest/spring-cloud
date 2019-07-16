package com.iammybest.springcloud.db.mybatis.entity;

import java.util.Date;

/**
 * @Author 邓清海
 * @Date 2017/11/9 11:01
 */
public class UserEntity {
    Integer id;
    String userName;
    Integer age;
    Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
