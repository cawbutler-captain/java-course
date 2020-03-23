package com.cawbutler.springcloud.netflix.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Value("${cawbutler.userName}")
    private String userName;

    @GetMapping("show")
    public String show() {
        return userName;
    }
}
