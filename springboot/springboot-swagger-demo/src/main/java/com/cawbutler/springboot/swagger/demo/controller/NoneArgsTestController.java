package com.cawbutler.springboot.swagger.demo.controller;

import com.cawbutler.springboot.swagger.demo.pojo.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags ="无参")
@RestController
public class NoneArgsTestController {
    @ApiOperation(value = "没有参数请求")
    @RequestMapping(value = "noneArgsTest", method = RequestMethod.GET)
    public RespResult<String> test() {

        RespResult<String> result = new RespResult<>();
        result.setCode(1);
        result.setMessage("请求成功");
        result.setData("xxxxxxxxxxxxxxxxx");

        return result;
    }

}
