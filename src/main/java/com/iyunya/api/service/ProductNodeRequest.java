package com.iyunya.api.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.iyunya.api.dto.ProductChooseReqDto;
import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.request.AbstractApiRequest;
import com.iyunya.api.util.Result;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author lx
 * @date 2021/3/4 14:22
 */
public class ProductNodeRequest extends AbstractApiRequest {
    @Override
    public Result execute(RequestParam requestParam) throws IOException {
        String param = JSONObject.toJSONString(requestParam);
        Map<String,Object> paramMap = JSONObject.parseObject(param,Map.class);
        return super.doGet(paramMap);
    }

    @Override
    public String getUrlParam() {
        return "/v1/product/node";
    }
}