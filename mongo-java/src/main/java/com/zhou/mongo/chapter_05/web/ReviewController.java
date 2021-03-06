/**
 * Date:     2018/5/2010:29
 * AUTHOR:   Administrator
 */
package com.zhou.mongo.chapter_05.web;

import com.alibaba.fastjson.JSONArray;
import com.zhou.mongo.chapter_05.service.ReviewService;
import com.zhou.mongo.model.Review;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2018/5/20  10:29
 * created by zhoumb
 */
@RestController
@RequestMapping(value = "/index/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @RequestMapping(value = "/getPreviewByProductId")
    public List<Review> getReviewByProductId(@RequestParam("productId") String productId) {
        return reviewService.findReviewByProductId(productId);
    }

    /**
     * 获取所有的商品机评论数
     *
     * @return
     */
    @RequestMapping(value = "/findAllProductReviewCount")
    public JSONArray findAllProductReviewCount() {
        return reviewService.findAllProductReviewCount();
    }

    /**
     * 获取某个商品的评价数量
     *
     * @param productId
     * @return
     */
    @RequestMapping(value = "/getReviewCountByProductId")
    public Document getReviewCountByProductId(@RequestParam("productId") String productId) {
        return reviewService.getReviewCountByProductId(productId);
    }

    /**
     * 获取商品的平均评分
     *
     * @return
     */
    @RequestMapping(value = "/getAverageReviewRate")
    public Document getAverageReviewRate(@RequestParam(value = "productId") String productId) {
        return reviewService.getAverageReviewRate(productId);
    }

    /**
     * 通过productId获取商品的详细评价信息（统计每各分数的评价）
     * @param productId
     * @return
     */
    @RequestMapping(value = "/getDetailReviewByProductId")
    public JSONArray getDetailReviewByProductId(@RequestParam(value = "productId") String productId) {
        return reviewService.getDetailReviewByProductId(productId);
    }

    /**
     * 统计每各用户的评价数量及有帮助的投票数
     * @return
     */
    @RequestMapping(value = "/getDetailReviewByUserId")
    public JSONArray getDetailReviewByUserId(){
        return reviewService.getDetailReviewByUserId();
    }
}
