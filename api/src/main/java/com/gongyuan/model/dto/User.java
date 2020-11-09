package com.gongyuan.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class User {
    private int id;
    @NotBlank(message = "用户名不能为空")
    private String name;
    private String gender;
    private String password;
    private String tel;
    private String area;
    private Date createDate;
    private Date updateDate;
    private int status;
}
