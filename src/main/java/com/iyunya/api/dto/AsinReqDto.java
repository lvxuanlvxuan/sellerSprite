package com.iyunya.api.dto;


/**
 * asin查询入参
 *
 * @author lx
 * @date 2021/3/10 17:16
 */
public class AsinReqDto extends RequestParam{

    /**
     * 市场
     */
    private String marketplace;

    private String asin;

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }
}