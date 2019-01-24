package com.djn.cn.sboot.mybatis.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.sboot.mybatis.base.constants.RedisCacheConstants;
import com.djn.cn.sboot.mybatis.base.util.CacheClient;
import com.djn.cn.sboot.mybatis.base.util.CacheClientUtilFactory;





@Controller
public class UserInfoController  {
    @ResponseBody
    @RequestMapping(value = "/")
    String home() {   
		CacheClient singleRedisCacheClient = CacheClientUtilFactory.createClient(1000);
        return singleRedisCacheClient.getCache(RedisCacheConstants.CACHE_KEY_MUDLE_NAME+"test1");
    }
}
