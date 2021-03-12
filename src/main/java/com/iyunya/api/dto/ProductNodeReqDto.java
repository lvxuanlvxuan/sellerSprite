package com.iyunya.api.dto;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 亚马逊节点查询
 *
 * @author lx
 * @date 2021/3/1 10:08
 */
public class ProductNodeReqDto extends RequestParam{

    /**
     * 亚马逊节点ID清单，如2335752011:240775501:2407776011
     */
    private String nodeIdPath;

    /**
     * 市场
     */
    private String marketplace;

    public String getNodeIdPath() {
        return nodeIdPath;
    }

    public void setNodeIdPath(String nodeIdPath) {
        this.nodeIdPath = nodeIdPath;
    }

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }
}