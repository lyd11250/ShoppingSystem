package com.lyd.shoppingsystem.dao;

import com.lyd.shoppingsystem.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM admins\n" +
            "WHERE name = #{name}"+
            "AND password = #{password} ")
    User login(String name, String password);
}
