package com.gongyuan.config;

import com.gongyuan.model.Result;
import com.gongyuan.model.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Tww
 * @date 2020/11/89:19 下午
 */
@RestControllerAdvice
@Slf4j
public class ExceptionCatchHandler {
    @ExceptionHandler(value = Exception.class)
    public Result handleException(Exception e){
        log.error("接口调用异常，异常信息：{}",e.getMessage());
        return Result.getErrorResult(e.getMessage());
    }

    @ExceptionHandler(value = ServiceException.class)
    public Result handleServiceException(ServiceException e){
        log.error("接口调用异常，异常信息：{}",e.getMessage());
        return Result.getErrorResult(e.getMessage());
    }
}
