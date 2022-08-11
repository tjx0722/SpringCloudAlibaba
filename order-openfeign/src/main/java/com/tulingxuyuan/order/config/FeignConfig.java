package com.tulingxuyuan.order.config;

import com.tulingxuyuan.order.interceptor.CustomFeignInterceptor;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 全局配置：当我们使用了Configuration会将配置作用在所有服务提供方
// 局部配置：如果只想针对某一个服务进行配置，则不加
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public CustomFeignInterceptor customFeignInterceptor(){
        return new CustomFeignInterceptor();
    }
}
