package com.gongyuan.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String name;
    private String gender;
    private String password;
    private String tel;
    private String area;
    private Date createDate;
    private Date updateDate;
    private int status;
}
