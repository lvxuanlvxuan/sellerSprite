package com.iyunya.api.dto;

import java.io.Serializable;

/**
 * 选产品请求参数
 *
 * @author lx
 * @date 2021/2/24 09:53
 */
public class ProductChooseReqDto extends RequestParam implements Serializable {

    private static final long serialVersionUID = -2842165643663698838L;

    /**
     * 市场标志
     */
    private String marketplace;

    /**
     * 关键字
     */
    private String keyword = "";

    /**
     * 排除关键字
     */
    private String excludeKeywords = "";


    /**
     * 最低价格
     */
    private Float minPrice;

    /**
     * 最高价格
     */
    private Float maxPrice;

    /**
     * 最低评分数
     */
    private Integer minRatings;

    /**
     * 最高评分数
     */
    private Integer maxRatings;

    /**
     * 最低评分值
     */
    private Float minRating;

    /**
     * 最高评分值
     */
    private Float maxRating;

    /**
     * 最低月新增评分数
     */
    private Integer minRatingsCv;

    /**
     * 最高月新增评分数
     */
    private Integer maxRatingsCv;

    /**
     * 最小卖家数量
     */
    private Integer minSellers;

    /**
     * 最大卖家数量
     */
    private Integer maxSellers;

    /**
     * 大类BSR最低排名
     */
    private Integer minBsr;

    /**
     * 大类BSR最高排名
     */
    private Integer maxBsr;

    /**
     * BSR最低增长数
     */
    private Integer minBsrCv;

    /**
     * BSR最高增长数
     */
    private Integer maxBsrCv;

    /**
     * BSR最低增长率
     */
    private Float minBsrCr;

    /**
     * BSR最高增长率
     */
    private Float maxBsrCr;

    /**
     * 最低月销量
     */
    private Integer minUnits;

    /**
     * 最高月销量
     */
    private Integer maxUnits;

    /**
     * 最低月销售额
     */
    private Float minRevenue;

    /**
     * 最高月销售额
     */
    private Float maxRevenue;

    /**
     * 月销售额最低增长率
     */
    private Float minRevenueCr;

    /**
     * 月销售额最高增长率
     */
    private Float maxRevenueCr;

    /**
     * 月销量最低增长率
     */
    private Float minUnitsCr;

    /**
     * 月销量最高增长率
     */
    private Float maxUnitsCr;

    /**
     * 类目选择
     */
    private String nodeIdPath;


    /**
     * 上架月份
     */
    private String availableMonth;


    /**
     * 尺寸类型集合,逗号分隔
     */
    private String dimensionType = "";

    /**
     *  FBA最低运费
     */
    private Float minFba;

    /**
     * FBA最高运费
     */
    private Float maxFba;

    /**
     * 用作前端批量查询
     */
    private String token;

    /**
     * 最低lqs
     */
    private Double minLqs;

    /**
     * 最高lqs
     */
    private Double maxLqs;

    /**
     * 卖家所属地
     */
    private String sellerNation;

    /**
     * 热销标识 Best Seller Y or N
     */
    private String badgeBS;

    /**
     * 热销标识 Amazon's Choice Y or N
     */
    private String badgeAC;

    /**
     * 配置方式 AMZ FBA FBM
     */
    private String fulfillment = "";

    /**
     * 筛选日期
     */
    private String month;

    /**
     * 是否查询变体asin Y:否 N:是
     */
    private String symbol = "N";

    private Integer page;

    private Integer size;

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getExcludeKeywords() {
        return excludeKeywords;
    }

    public void setExcludeKeywords(String excludeKeywords) {
        this.excludeKeywords = excludeKeywords;
    }

    public Float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Float minPrice) {
        this.minPrice = minPrice;
    }

    public Float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMinRatings() {
        return minRatings;
    }

    public void setMinRatings(Integer minRatings) {
        this.minRatings = minRatings;
    }

    public Integer getMaxRatings() {
        return maxRatings;
    }

    public void setMaxRatings(Integer maxRatings) {
        this.maxRatings = maxRatings;
    }

    public Float getMinRating() {
        return minRating;
    }

    public void setMinRating(Float minRating) {
        this.minRating = minRating;
    }

    public Float getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(Float maxRating) {
        this.maxRating = maxRating;
    }

    public Integer getMinRatingsCv() {
        return minRatingsCv;
    }

    public void setMinRatingsCv(Integer minRatingsCv) {
        this.minRatingsCv = minRatingsCv;
    }

    public Integer getMaxRatingsCv() {
        return maxRatingsCv;
    }

    public void setMaxRatingsCv(Integer maxRatingsCv) {
        this.maxRatingsCv = maxRatingsCv;
    }

    public Integer getMinSellers() {
        return minSellers;
    }

    public void setMinSellers(Integer minSellers) {
        this.minSellers = minSellers;
    }

    public Integer getMaxSellers() {
        return maxSellers;
    }

    public void setMaxSellers(Integer maxSellers) {
        this.maxSellers = maxSellers;
    }

    public Integer getMinBsr() {
        return minBsr;
    }

    public void setMinBsr(Integer minBsr) {
        this.minBsr = minBsr;
    }

    public Integer getMaxBsr() {
        return maxBsr;
    }

    public void setMaxBsr(Integer maxBsr) {
        this.maxBsr = maxBsr;
    }

    public Integer getMinBsrCv() {
        return minBsrCv;
    }

    public void setMinBsrCv(Integer minBsrCv) {
        this.minBsrCv = minBsrCv;
    }

    public Integer getMaxBsrCv() {
        return maxBsrCv;
    }

    public void setMaxBsrCv(Integer maxBsrCv) {
        this.maxBsrCv = maxBsrCv;
    }

    public Float getMinBsrCr() {
        return minBsrCr;
    }

    public void setMinBsrCr(Float minBsrCr) {
        this.minBsrCr = minBsrCr;
    }

    public Float getMaxBsrCr() {
        return maxBsrCr;
    }

    public void setMaxBsrCr(Float maxBsrCr) {
        this.maxBsrCr = maxBsrCr;
    }

    public Integer getMinUnits() {
        return minUnits;
    }

    public void setMinUnits(Integer minUnits) {
        this.minUnits = minUnits;
    }

    public Integer getMaxUnits() {
        return maxUnits;
    }

    public void setMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
    }

    public Float getMinRevenue() {
        return minRevenue;
    }

    public void setMinRevenue(Float minRevenue) {
        this.minRevenue = minRevenue;
    }

    public Float getMaxRevenue() {
        return maxRevenue;
    }

    public void setMaxRevenue(Float maxRevenue) {
        this.maxRevenue = maxRevenue;
    }

    public Float getMinRevenueCr() {
        return minRevenueCr;
    }

    public void setMinRevenueCr(Float minRevenueCr) {
        this.minRevenueCr = minRevenueCr;
    }

    public Float getMaxRevenueCr() {
        return maxRevenueCr;
    }

    public void setMaxRevenueCr(Float maxRevenueCr) {
        this.maxRevenueCr = maxRevenueCr;
    }

    public Float getMinUnitsCr() {
        return minUnitsCr;
    }

    public void setMinUnitsCr(Float minUnitsCr) {
        this.minUnitsCr = minUnitsCr;
    }

    public Float getMaxUnitsCr() {
        return maxUnitsCr;
    }

    public void setMaxUnitsCr(Float maxUnitsCr) {
        this.maxUnitsCr = maxUnitsCr;
    }

    public String getNodeIdPath() {
        return nodeIdPath;
    }

    public void setNodeIdPath(String nodeIdPath) {
        this.nodeIdPath = nodeIdPath;
    }

    public String getAvailableMonth() {
        return availableMonth;
    }

    public void setAvailableMonth(String availableMonth) {
        this.availableMonth = availableMonth;
    }

    public String getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
    }

    public Float getMinFba() {
        return minFba;
    }

    public void setMinFba(Float minFba) {
        this.minFba = minFba;
    }

    public Float getMaxFba() {
        return maxFba;
    }

    public void setMaxFba(Float maxFba) {
        this.maxFba = maxFba;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getMinLqs() {
        return minLqs;
    }

    public void setMinLqs(Double minLqs) {
        this.minLqs = minLqs;
    }

    public Double getMaxLqs() {
        return maxLqs;
    }

    public void setMaxLqs(Double maxLqs) {
        this.maxLqs = maxLqs;
    }

    public String getSellerNation() {
        return sellerNation;
    }

    public void setSellerNation(String sellerNation) {
        this.sellerNation = sellerNation;
    }

    public String getBadgeBS() {
        return badgeBS;
    }

    public void setBadgeBS(String badgeBS) {
        this.badgeBS = badgeBS;
    }

    public String getBadgeAC() {
        return badgeAC;
    }

    public void setBadgeAC(String badgeAC) {
        this.badgeAC = badgeAC;
    }

    public String getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(String fulfillment) {
        this.fulfillment = fulfillment;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}