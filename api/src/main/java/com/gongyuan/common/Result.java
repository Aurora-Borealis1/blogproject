package com.gongyuan.common;

import lombok.Data;

/**
 * @author wushangyi
 * @date 2020/11/8 21:07
 */
@Data
public class Result {
    private String code;
    private String msg;
    private Object data;



    public static Result getSuccessfulResult(Object data){
        Result result = getSuccessfulResult();
        result.setData(data);
        return result;
    }


    public static Result getSuccessfulResult(){
        Result result = new Result();
        result.setCode("200");
        result.setMsg("正常返回");
        return result;
    }

    public static Result getErrorResult(){
        Result result = new Result();
        result.setCode("9999");
        result.setMsg("接口调用异常");
        return result;
    }
    public static Result getErrorResult(Object data){
        Result result = getErrorResult();
        result.setData(data);
        return result;
    }
}
