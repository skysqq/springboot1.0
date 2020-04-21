package com.learn.pojo;

import lombok.Data;

/**
 * 自定义响应类
 */
@Data
public class ResponseResult {
    private Integer code;
    private String message;


    public ResponseResult() {
    }

    public ResponseResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
