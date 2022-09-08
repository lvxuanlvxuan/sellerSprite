package com.iyunya.api.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

/**
 * @author lvxuan
 * @description 查竞品返回信息
 */
@Data
@ContentRowHeight(17)
@HeadRowHeight(20)
@ColumnWidth(20)
public class CompetitorProductResDTO {

    @ExcelProperty("asin")
    private String asin;

    @ExcelProperty("品牌")
    private String brand;

    @ExcelProperty("品牌 URL")
    private String brandUrl;

    @ExcelProperty("图片 URL")
    private String imageUrl;

    @ExcelProperty("商品标题")
    private String title;

    @ExcelProperty("父体")
    private String parent;

    @ExcelProperty("类目")
    private String nodeLabelPath;

    @ExcelProperty("节点 id 路径字符串")
    private String nodeIdPath;

    @ExcelProperty("节点 id")
    private Long nodeId;

    @ExcelProperty("BSRid")
    private String bsrId;

    @ExcelProperty("BS 排名")
    private Integer bsr;

    @ExcelProperty("月销量")
    private Integer units;

    @ExcelProperty("月销量增长率")
    private Double unitsGr;

    @ExcelProperty("月销售额")
    private Double revenue;

    @ExcelProperty("价格")
    private Double price;

    @ExcelProperty("利润率")
    private Double profit;

    @ExcelProperty("fba 运费")
    private Double fba;

    @ExcelProperty("评分数")
    private Integer ratings;

    @ExcelProperty("留评率")
    private Double ratingsRate;

    @ExcelProperty("评分")
    private Double rating;

    @ExcelProperty("月度增长数")
    private Integer ratingsCv;

    @ExcelProperty("留评数：近 30 天新增评论数")
    private Integer ratingDelta;

    @ExcelProperty("上架时间，时间戳格式")
    private Long availableDate;

    @ExcelProperty("配送方式")
    private String fulfillment;

    @ExcelProperty("变体数")
    private Integer variations;

    @ExcelProperty("卖家数")
    private Integer sellers;

    @ExcelProperty("BuyBox 卖家")
    private String sellerName;

    @ExcelProperty("BuyBox 卖家 id")
    private String sellerId;

    @ExcelProperty("BuyBox 卖家国籍")
    private String sellerNation;

    @ExcelProperty("重量")
    private String weight;

    @ExcelProperty("尺寸")
    private String dimension;

    @ExcelProperty("尺寸类型")
    private String sku;

//    private Badge badge;
//
//    @Data
//    public static class Badge {
//        private String amazonChoice;
//
//        private String newRelease;
//
//        private String ebc;
//
//        private String video;
//    }

}
