package com.iyunya.api;

import com.alibaba.fastjson.JSONObject;
import com.iyunya.api.dto.*;
import com.iyunya.api.request.ApiRequestClient;
import com.iyunya.api.util.Result;

import java.io.IOException;
import java.util.List;

/**
 * @author lx
 * @date 2021/3/3 10:39
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ApiRequestClient client = ApiRequestClient.build("http://localhost:8088", "db927f2c0581475aa9c62023b2bf72b1");
        ProductChooseReqDto reqDto = new ProductChooseReqDto();
        reqDto.setMarketplace("US");
        reqDto.setMonth("nearly");
        Result execute = client.execute(reqDto);
        System.out.println(JSONObject.toJSONString(execute));

//        AsinReqDto asinReqDto = new AsinReqDto();
//        asinReqDto.setMarketplace("US");
//        asinReqDto.setAsin("B01BI90V8M");
//        Result execute1 = client.execute(asinReqDto);
//        System.out.println(JSONObject.toJSONString(execute1));
    }
}