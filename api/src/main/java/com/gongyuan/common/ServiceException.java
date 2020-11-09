package com.gongyuan.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author wushangyi
 * @date 2020/11/8 21:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends RuntimeException{
    public static final String USER_EXCEPTION = "用户接口异常";
}
