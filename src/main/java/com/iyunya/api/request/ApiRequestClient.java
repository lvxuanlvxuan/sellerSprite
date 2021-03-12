package com.iyunya.api.request;

import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.util.Result;

import java.io.IOException;

/**
 * api请求类
 *
 * @author lx
 * @date 2021/3/3 10:40
 */
public class ApiRequestClient {

    /**
     * 请求地址
     */
    private String url;

    /**
     * 秘钥
     */
    private String secretKey;

    private ApiRequestClient(){}

    public static ApiRequestClient build(String url,String secretKey){
        ApiRequestClient apiRequestClient = new ApiRequestClient();
        apiRequestClient.url = url;
        apiRequestClient.secretKey = secretKey;
        return apiRequestClient;
    }

    public Result execute(RequestParam requestParam) throws IOException {
        ApiRequest apiRequest = ApiRequestFactory.getRequest(requestParam);
        Result result = apiRequest.build(this.url, this.secretKey).execute(requestParam);
        return result;
    }
}