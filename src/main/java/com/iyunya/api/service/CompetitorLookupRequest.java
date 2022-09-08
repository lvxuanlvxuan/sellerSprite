package com.iyunya.api.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.iyunya.api.dto.CompetitorProductReqDto;
import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.request.AbstractApiRequest;
import com.iyunya.api.util.Result;

import java.io.IOException;
import java.util.List;

/**
 * 查竞品
 * @author lx
 * @date 2021/3/4 12:06
 */
public class CompetitorLookupRequest extends AbstractApiRequest {
    @Override
    public Result execute(RequestParam requestParam) throws IOException {
        return super.doPost(requestParam);
    }

    @Override
    public String getUrlParam() {
        return "/v1/product/competitor-lookup";
    }
}