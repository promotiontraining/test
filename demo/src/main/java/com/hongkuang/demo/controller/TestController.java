package com.hongkuang.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Xiaobo Wu
 * @create 2019/4/9
 */
@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @ResponseBody
    public String bindCard(HttpServletRequest request) {
        logger.info("欢迎进入hello world");
        return "hello world";
    }

}




