package com.iyunya.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 查竞品请求类
 * @author lx
 * @date 2021/2/24 16:20
 */
public class CompetitorProductReqDto extends RequestParam implements Serializable {

    private static final long serialVersionUID = 8214993506945929223L;

    /**
     * 市场
     */
    private String marketplace;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 卖家
     */
    private String sellerName;

    /**
     * asin
     */
    private List<String> asins;

    /**
     * 类目节点字符串
     */
    private String nodeIdPath;

    /**
     * 查询日期条件
     */
    private String month;

    /**
     * 关键字
     */
    private String keyword;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    /**
     * 是否查询变体asin Y:否 N:是
     */
    private String variation;

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public List<String> getAsins() {
        return asins;
    }

    public void setAsins(List<String> asins) {
        this.asins = asins;
    }

    public String getNodeIdPath() {
        return nodeIdPath;
    }

    public void setNodeIdPath(String nodeIdPath) {
        this.nodeIdPath = nodeIdPath;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

}