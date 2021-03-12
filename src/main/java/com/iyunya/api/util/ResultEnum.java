package com.iyunya.api.util;

/**
 * 返回code码
 *
 * @author lx
 * @date 2021/2/22 18:02
 */
public enum ResultEnum {

    OK("OK","成功"),
    ERROR_500("ERROR_SERVER_INTERNAL","服务器内部错误"),
    ERROR_10000("ERROR_PARAM","参数错误"),
    ERROR_10001("ERROR_SECRET_KEY","秘钥错误"),
    ERROR_10002("ERROR_SECRET_KEY_OVERDUE","秘钥过期"),
    ERROR_10003("ERROR_VISIT_MAX","接口访问次数已达上限"),
    ERROR_10004("ERROR_SECRET_KEY_INVALID","秘钥无效"),
    ;

    private String code;

    private String message;

    ResultEnum(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}