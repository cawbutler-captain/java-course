package com.cawbutler.springboot.swagger.demo.controller;

import com.cawbutler.springboot.swagger.demo.entity.User;
import com.cawbutler.springboot.swagger.demo.pojo.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "实体传参")
@RestController
public class ObjectArgsTestController {


    @ApiOperation(value = "实体对象传参请求", notes = "调用当前方法的注意事项")
    @RequestMapping(value = "objectArgsTest", method = RequestMethod.POST)
    public RespResult<User> test5(@RequestBody User user) {
        RespResult<User> result = new RespResult<>();
        result.setCode(0);
        result.setMessage("请求成功--------");
        result.setData(user);
        return result;
    }
}
