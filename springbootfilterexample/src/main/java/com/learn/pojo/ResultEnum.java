package com.learn.pojo;

/**
 * 自定义响应类
 */
public enum ResultEnum {
    SUCCESS(200,"请求成功"),
    PARAMETER_ERROR(400,"参数请求错误!"),
    UNKNOWN_ERROR(500,"未知的错误!");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
