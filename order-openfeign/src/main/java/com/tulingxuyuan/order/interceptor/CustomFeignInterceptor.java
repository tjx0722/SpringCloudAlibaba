package com.tulingxuyuan.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Component
public class CustomFeignInterceptor implements RequestInterceptor {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    public void apply(RequestTemplate template) {
        //todo
        template.header("aaa", "111");
        log.info("feign拦截器");
    }
}
