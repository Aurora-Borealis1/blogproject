package com.gongyuan.model;

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
        Result result = new Result();
        result.setCode("200");
        result.setMsg("正常返回");
        result.setData(data);
        return result;
    }


    public static Result getSuccessfulResult(){
        Result result = new Result();
        result.setCode("200");
        result.setMsg("正常返回");
        return result;
    }
}
