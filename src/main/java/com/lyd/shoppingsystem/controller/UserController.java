package com.lyd.shoppingsystem.controller;

import com.lyd.shoppingsystem.model.User;
import com.lyd.shoppingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    User login(String name, String password){
        return userService.loginService(name,password);
    }

}
