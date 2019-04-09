package com.hongkuang.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Xiaobo Wu
 * @create 2019/4/9
 * @description 拦截器配置类
 */
@Configuration
public class InterceptorConfig  extends WebMvcConfigurerAdapter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("进入拦截器配置");
        registry.addInterceptor(new EncodeInterceptor()).addPathPatterns("/**");
    }
}
