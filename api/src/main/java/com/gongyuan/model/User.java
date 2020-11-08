package com.gongyuan.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String gender;
    private String password;
    private String tel;
    private String area;
    private int status;
}
