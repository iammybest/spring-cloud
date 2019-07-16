package com.iammybest.springcloud.db.mybatis.dao;

import com.iammybest.springcloud.db.mybatis.entity.UserEntity;
import com.iammybest.springcloud.db.mybatis.vo.UserVo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface UserDAO {
    @Select("SELECT * FROM t_user WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "age", column = "age"),
            @Result(property = "userName", column = "user_name")
    })
    UserVo get(Integer id);



    @Update("update t_user set create_time = #{createTime} where id =#{id}")
    void updateLoginTime(UserEntity userEntity);
}
