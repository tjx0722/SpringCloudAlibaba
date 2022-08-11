package com.tulingxuyuan.order.controller;

import com.tulingxuyuan.order.feign.ProductFeign;
import com.tulingxuyuan.order.feign.StockFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    StockFeign stockFeign;

    @Autowired
    ProductFeign productFeign;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String reduce = stockFeign.reduce();
        //String msg = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);

        String pro = productFeign.queryProduct("666");
        return "hello feign!" + reduce +"\n" + pro;
//                +msg;
    }
}

