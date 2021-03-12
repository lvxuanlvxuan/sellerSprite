package com.iyunya.api.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.util.Result;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;

/**
 * @author lx
 * @date 2021/3/3 11:08
 */
public abstract class AbstractApiRequest implements ApiRequest{

    private OkHttpClient client = new OkHttpClient();

    private Request.Builder requestBuilder;

    private String urlPrefix;

    public ApiRequest build(String urlPrefix,String secretKey){
        Headers headers = new Headers.Builder()
                .add("context-type:application/json")
                .add("secretKey:"+secretKey).build();
        requestBuilder = new Request.Builder().headers(headers);
        this.urlPrefix = urlPrefix;
        return this;
    }

    public Result doGet(Map<String,Object> paramMap) throws IOException {
        return doGet(paramMap,urlPrefix + getUrlParam());
    }

    public Result doGet(Map<String,Object> paramMap,String url) throws IOException {
        StringBuilder paramBuilder = new StringBuilder();
        //OKHTTP使用的Kotlin语法，IDEA设置为忽略错误即可运行
        paramBuilder.append(urlPrefix + url).append("?");
        for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
            paramBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        String actualUrl = paramBuilder.toString();
        Request request = requestBuilder.url(actualUrl.substring(0,actualUrl.length() - 1)).get().build();
        return getResult(request);
    }

    private Result getResult(Request request) throws IOException {
        Response response = client.newBuilder().build().newCall(request).execute();
        String content = response.body().string();
        if(content == null || content.equals(""))
            throw new RuntimeException("网络错误");
        Result result = JSON.parseObject(content,new TypeReference<Result>(){});
        if(result.getCode() == null || result.getCode() == "")
            throw new RuntimeException("网络错误");
        return result;
    }

    public Result doPost(RequestParam requestParam) throws IOException {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),JSONObject.toJSONString(requestParam));
        Request request = requestBuilder.url(urlPrefix+getUrlParam()).post(requestBody).build();
        return getResult(request);
    }
}