package com.learn.controller;

import com.learn.entity.User;
import com.learn.filter1.ParamaErrorException;
import com.learn.pojo.ResponseResult;
import com.learn.pojo.ResultEnum;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TestController {

   /* @GetMapping("/aa/hello")
    public String hello1(){
        return "hello world! aa";
    }

    @GetMapping("/bb/hello")
    public String hello2(){
        return "hello world! bb";
    }

    @GetMapping("/cc/hello")
    @Validated
    public String hello3(){
        return "hello world! cc";
    }*/


    /**
     * 获取用户信息
     *
     * @param username 姓名
     * @return ResponseResult
     */
    @Validated
    @GetMapping("/user/{username}")
    public ResponseResult findUserInfo(@PathVariable String username) {
        if (username == null || "".equals(username)) {
            throw new ParamaErrorException("username 不能为空");
        }
        return new ResponseResult(ResultEnum.SUCCESS);
    }


    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return ResponseResult
     */
    @PostMapping("/user")
    public ResponseResult addUserInfo(@Valid @RequestBody User user) {
        return new ResponseResult(ResultEnum.SUCCESS);
    }
}
