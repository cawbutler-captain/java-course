package com.cawbutler.springboot.swagger.demo.controller;

import com.cawbutler.springboot.swagger.demo.pojo.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单参数
 */
@Api(tags = "简单传参")
@RestController
public class SimpleArgsTestController {

    @ApiOperation(value = "简单参数请求")
    /**
     * @ApiImplicitParam
     * paramType：类型(数据放在那里的问题)
     *      * header：请求的数据放在请求头里面的 就用这个类型
     *      * query：请求的参数 放到了请求地址上、配套的（@requestParam）
     *      * path：（RestFul中用于面向资源编程的获取数据的方式），配套的获取数据的注解 @PathVarible
     *      * body(不会用)
     *      * form(基本不用)
     * name：说明的是参数的名字叫什么
     * value：当前参数的含义
     * required：当前使用这个接口对哦时候 这个参数是不是一定要传
     * dataType：参数的类型
     */
    @ApiImplicitParam(paramType = "query", name = "userName", value = "用户名", required = true, dataType = "String")
    @RequestMapping(value = "simpleArgsTest", method = RequestMethod.GET)
    public RespResult<String> test(@RequestParam("userName") String userName) {
        RespResult<String> result = new RespResult<>();
        result.setCode(1);
        result.setMessage("请求成功");
        result.setData("xxxxxxxxxxxxxxxxx:" + userName);
        return result;
    }
}
