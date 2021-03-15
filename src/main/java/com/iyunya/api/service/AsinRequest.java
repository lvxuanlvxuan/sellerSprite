package com.iyunya.api.service;

import com.iyunya.api.dto.AsinReqDto;
import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.request.AbstractApiRequest;
import com.iyunya.api.util.Result;

import java.io.IOException;
import java.util.HashMap;

/**
 * AsinDetailRequest
 *
 * @author lx
 * @date 2021/3/11 14:22
 */
public class AsinRequest  extends AbstractApiRequest {

    public Result execute(RequestParam requestParam) throws IOException {
        AsinReqDto asinReqDto = (AsinReqDto)requestParam;
        return super.doGet(new HashMap<String, Object>(),getUrlParam() + asinReqDto.getMarketplace() + "/" + asinReqDto.getAsin());
    }

    public String getUrlParam() {
        return "/v1/asin/";
    }
}