package com.iyunya.api.request;

import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.util.Result;

import java.io.IOException;
import java.util.Map;

/**
 * api请求基本类
 *
 * @author lx
 * @date 2021/3/3 11:04
 */
public interface ApiRequest {

    ApiRequest build(String url,String secretKey);

    Result doGet(Map<String,Object> paramMap)  throws IOException;

    Result doPost(RequestParam requestParam)  throws IOException;

    Result execute(RequestParam requestParam)  throws IOException;

    String getUrlParam();
}