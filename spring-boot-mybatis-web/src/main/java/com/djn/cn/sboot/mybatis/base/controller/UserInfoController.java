package com.djn.cn.sboot.mybatis.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.sboot.mybatis.base.constants.RedisCacheConstants;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;
import com.djn.cn.sboot.mybatis.base.util.CacheClient;
import com.djn.cn.sboot.mybatis.base.util.CacheClientUtilFactory;





@Controller
public class UserInfoController  {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private ITBOneService iTKOneService;
    @ResponseBody
    @RequestMapping(value = "/")
    String home() {   
		CacheClient singleRedisCacheClient = CacheClientUtilFactory.createClient(1000);
        System.out.println("AAAA");
		return singleRedisCacheClient.getCache(RedisCacheConstants.CACHE_KEY_MUDLE_NAME+"test1");
    }
    @ResponseBody
    @RequestMapping(value = "/list")
    Object list() {   
    	logger.debug("debug");
    	logger.info("info");
    	logger.error("error");
    	return iTKOneService.selectAll();
    }
}
