package com.iyunya.api.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.request.AbstractApiRequest;
import com.iyunya.api.util.Result;

import java.io.IOException;
import java.util.List;

/**
 * 选产品
 * @author lx
 * @date 2021/3/3 11:40
 */
public class ProductResearchRequest<T> extends AbstractApiRequest {

    public Result execute(RequestParam requestParam) throws IOException {
        return super.doPost(requestParam);
    }

    public String getUrlParam() {
        return "/v1/product/research";
    }
}