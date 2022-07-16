package com.lyd.shoppingsystem.dao;

import com.lyd.shoppingsystem.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select id,name,users.group,phone,sex,age,address from users where name = #{username} and password = #{password}")
    User login(@Param("username") String name, @Param("password") String password);
}
