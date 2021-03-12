package com.iyunya.api.util;

import com.iyunya.api.dto.RequestParam;

import java.util.List;

/**
 * 返回信息
 *
 * @author lx
 * @date 2021/2/22 18:01
 */
public class Result<T> {

    private String code;

    private String message;

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}