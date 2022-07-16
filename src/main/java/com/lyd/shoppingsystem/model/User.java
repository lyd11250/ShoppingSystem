package com.lyd.shoppingsystem.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer group;
    private String phone;
    private Integer sex;
    private Integer age;
    private String address;
}
