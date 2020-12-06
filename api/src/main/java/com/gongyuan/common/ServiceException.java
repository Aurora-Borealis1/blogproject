package com.gongyuan.common;

import com.gongyuan.enumration.ExceptionMessageEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wushangyi
 * @date 2020/11/8 21:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class ServiceException extends RuntimeException{


    public ServiceException(String message) {
        super(message);
    }


    public ServiceException(ExceptionMessageEnum exceptionMessageEnumssage) {
        super(exceptionMessageEnumssage.getMessage());
    }
}

