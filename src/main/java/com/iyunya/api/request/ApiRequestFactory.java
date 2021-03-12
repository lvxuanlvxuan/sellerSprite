package com.iyunya.api.request;

import com.iyunya.api.dto.*;
import com.iyunya.api.service.AsinRequest;
import com.iyunya.api.service.CompetitorLookupRequest;
import com.iyunya.api.service.ProductNodeRequest;
import com.iyunya.api.service.ProductResearchRequest;

import java.util.List;

/**
 * getRequest
 *
 * @author lx
 * @date 2021/3/4 11:48
 */
public class ApiRequestFactory {

    public static ApiRequest getRequest(RequestParam requestParamClazz){

        if(requestParamClazz instanceof ProductChooseReqDto){
            return new ProductResearchRequest();
        }
        if(requestParamClazz instanceof CompetitorProductReqDto){
            return new CompetitorLookupRequest();
        }
        if(requestParamClazz instanceof ProductNodeReqDto){
            return new ProductNodeRequest();
        }
        if(requestParamClazz instanceof AsinReqDto){
            return new AsinRequest();
        }
        throw new RuntimeException("未找到对应请求接口");
    }
}