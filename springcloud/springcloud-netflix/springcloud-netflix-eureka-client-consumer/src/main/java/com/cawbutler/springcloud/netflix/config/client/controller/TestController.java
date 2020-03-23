package com.cawbutler.springcloud.netflix.config.client.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("testByRest")
    public String testByRest() {
        String result = restTemplate.getForObject("http://provider/" + "test", String.class);
        return "远程调用:" + result;
    }

    @GetMapping("list")
    public String list() {
        List<ServiceInstance> instanceList = discoveryClient.getInstances("provider");
        List<String> list = instanceList.stream().map(ServiceInstance::getInstanceId).collect(Collectors.toList());
        return JSON.toJSONString(list);
    }
}
