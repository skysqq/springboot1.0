package com.learn.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

/*@Getter
@Setter*/
@Data
public class UserInfo {

    @NotBlank(message = "年龄不为空")
    @Max(value = 18,message = "不能超过18岁")
    private String age;

    @NotBlank(message = "性别不能为空")
    private String gender;

}
