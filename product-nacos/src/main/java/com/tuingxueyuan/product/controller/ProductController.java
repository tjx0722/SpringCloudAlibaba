package com.tuingxueyuan.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/{id}")
    public String queryproduct(@PathVariable("id") String id){
        System.out.println("查询商品id" + id);
        return "扣减库存"+port;
    }
}
