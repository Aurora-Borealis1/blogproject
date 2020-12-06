package com.gongyuan.model.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class User {
    private int id;

    @NotBlank(message = "用户名不能为空")
    private String name;

    private String gender;

    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = " [0-9A-Za-z]{6,20}")
    private String password;

    @NotBlank(message = "联系方式不能为空")
    @Pattern(regexp = "1[3-8][0-9]\\d{8}")
    private String tel;

    private String area;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    private Date createDate;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    private Date updateDate;

    @NotNull(message = "用户状态不能为空")
    private int status;
}
