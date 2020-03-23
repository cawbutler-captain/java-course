package com.cawbutler.springcloud.netflix.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        System.out.println("服务提供者 test 被调用");
        return "服务提供者调用成功";
    }
}
