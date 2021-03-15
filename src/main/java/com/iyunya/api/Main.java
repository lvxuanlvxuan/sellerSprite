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

        //网关
        String url = "https://api.sellersprite.com/";
        //秘钥
        String secretKey= "你的秘钥";

        ApiRequestClient client = ApiRequestClient.build(url, secretKey);

        //选产品
        ProductChooseReqDto chooseReqDto = new ProductChooseReqDto();
        chooseReqDto.setMarketplace("US");
        chooseReqDto.setMonth("nearly");
        Result chooseResult = client.execute(chooseReqDto);
        System.out.println(JSONObject.toJSONString(chooseResult));

        //查ASIN详情
        AsinReqDto asinReqDto = new AsinReqDto();
        asinReqDto.setMarketplace("US");
        asinReqDto.setAsin("B01BI90V8M");
        Result asinResult = client.execute(asinReqDto);
        System.out.println(JSONObject.toJSONString(asinResult));

        //查产品类目
        ProductNodeReqDto nodeReqDto = new ProductNodeReqDto();
        nodeReqDto.setMarketplace("US");
        Result nodeResult = client.execute(nodeReqDto);
        System.out.println(JSONObject.toJSONString(nodeResult));

        //查竞品
        CompetitorProductReqDto competitorProductReqDto = new CompetitorProductReqDto();
        competitorProductReqDto.setMarketplace("US");
        competitorProductReqDto.setMonth("nearly");
        Result competitorResult = client.execute(competitorProductReqDto);
        System.out.println(JSONObject.toJSONString(competitorResult));
    }
}