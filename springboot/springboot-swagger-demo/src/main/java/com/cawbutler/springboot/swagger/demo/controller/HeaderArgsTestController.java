package com.cawbutler.springboot.swagger.demo.controller;

import com.cawbutler.springboot.swagger.demo.entity.User;
import com.cawbutler.springboot.swagger.demo.pojo.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "请求头传参")
@RestController
public class HeaderArgsTestController {
    @RequestMapping(value = "test6", method = RequestMethod.POST)
    @ApiOperation(value = "请求头传参", notes = "调用当前方法的注意事项")
    @ApiImplicitParam(paramType = "header", name = "token", value = "用户token", required = true, dataType = "String")
    public RespResult<User> test6(@RequestBody User user, HttpServletRequest request) {
        String token = request.getHeader("token");
        RespResult<User> result = new RespResult<>();
        result.setCode(0);
        result.setMessage("请求成功--------:" + token);
        result.setData(user);
        return result;
    }
}
