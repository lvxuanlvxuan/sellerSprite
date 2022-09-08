package com.iyunya.api.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.iyunya.api.dto.CompetitorProductReqDto;
import com.iyunya.api.dto.CompetitorProductResDTO;
import com.iyunya.api.dto.RequestParam;
import com.iyunya.api.request.ApiRequestClient;
import com.iyunya.api.util.Result;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author lvxuan
 * @description controller 入口
 */
@RestController
@RequestMapping("/sellerSprite-controller")
public class SellerSpriteController<E extends RequestParam> {

    private static String url = "https://api.sellersprite.com/";

    private static String secretKey = "2df5a1b7bf2f475796529113d79e5e73";

    private ApiRequestClient client;

    @Resource
    private HttpServletResponse response;

    @PostConstruct
    private void initClient() {
        client = ApiRequestClient.build(url, secretKey);
    }

    @PostMapping("/competitorProduct")
    public void competitorProduct(@RequestBody CompetitorProductReqDto competitorProductReqDto) throws IOException {
        Result execute = client.execute(competitorProductReqDto);
        Object data = execute.getData();
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(data));
        String items1 = jsonObject.getString("items");
        List<CompetitorProductResDTO> competitorProductResDTOS = JSONArray.parseArray(items1, CompetitorProductResDTO.class);

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), CompetitorProductResDTO.class).sheet("模板").doWrite(competitorProductResDTOS);
    }
}
