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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Api(tags = "文件传参")
@RestController
public class FileArgsTestController {
    /**
     * Swagger测试文件上传的方法
     *
     * @param request
     * @param uId
     * @param file
     * @return
     */
    @RequestMapping(value = "fileupload", method = RequestMethod.POST)
    @ApiOperation(value = "文件传参请求", notes = "调用当前方法的注意事项")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", value = "用户token", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "uId", value = "用户的id", required = true, dataType = "Integer")
    })
    public RespResult<String> fileupload(HttpServletRequest request, @RequestParam("uId") int uId, @RequestParam("file") MultipartFile file) {
        String token = request.getHeader("token");
        RespResult<String> result = new RespResult<>();
        //接下来就可以将文件另存了
        try {
            file.transferTo(File.createTempFile("test", "jpg"));
            result.setCode(0);
            result.setMessage("请求成功--------:" + file.getOriginalFilename());
            result.setData("上传是成功的");
        } catch (IOException e) {
            result.setCode(1);
            result.setMessage("上传是失败的:" + e.getMessage());
            result.setData("");
        }
        return result;
    }

}
