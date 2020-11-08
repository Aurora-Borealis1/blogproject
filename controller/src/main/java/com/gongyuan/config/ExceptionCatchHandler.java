package com.gongyuan.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Tww
 * @date 2020/11/89:19 下午
 */
@RestControllerAdvice
public class ExceptionCatchHandler {
    @ExceptionHandler(value = Exception.class)
    public void handleException(Exception e){
        return;
    }

    @ExceptionHandler(value = Exception.class)
    public void handleServiceException(Exception e){
        return;
    }
}
