package com.cawbutler.springboot.swagger.demo.controller;

import com.cawbutler.springboot.swagger.demo.pojo.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "多个参数")
@RestController
public class MultiArgsTestController {

    @RequestMapping(value = "multiArgsTest", method = RequestMethod.GET)
    @ApiOperation(value = "多个参数请求", notes = "调用当前方法的注意事项")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "password", value = "密码", required = true, dataType = "String")
    })
    public RespResult<String> test3(@RequestParam("userName") String userName
            , @RequestParam("password") String password) {
        RespResult<String> result = new RespResult<>();
        result.setCode(1);
        result.setMessage("请求成功");
        result.setData("xxxxxxxxxxxxxxxxx:" + userName + "----:" + password);
        return result;
    }


}
