package com.lyd.shoppingsystem.service;

import com.lyd.shoppingsystem.dao.UserMapper;
import com.lyd.shoppingsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User loginService(String name, String password){
        return userMapper.login(name, password);
    };
}
