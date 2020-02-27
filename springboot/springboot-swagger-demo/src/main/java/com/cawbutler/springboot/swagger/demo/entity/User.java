package com.cawbutler.springboot.swagger.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户对象")
public class User {
    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "用户id")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
