package com.gongyuan.enumration;

import lombok.Getter;

@Getter
public enum ExceptionMessageEnum {
    USER_EXCEPTION("用户接口异常"),
    UNKNOW_EXCEPTION( "未知异常"),
    ;

    private final String message;

    ExceptionMessageEnum(String message) {
        this.message = message;
    }

}
