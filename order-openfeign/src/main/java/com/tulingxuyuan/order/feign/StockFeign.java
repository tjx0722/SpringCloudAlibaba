package com.tulingxuyuan.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * name指定调用接口服务名、
 * path指定调用的rest接口所在的controller指定的RequestMapping
 * */
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeign {
    @RequestMapping("/reduce")
    String reduce();
}
