package com.cawbutler.springboot.swagger.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("统一数据返回实体")
public class RespResult<T> {

    @ApiModelProperty("状态值：0为正常 其它为异常")
    private int code = 0;
    @ApiModelProperty("异常信息描述")
    private String message;
    @ApiModelProperty("业务数据实体")
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
