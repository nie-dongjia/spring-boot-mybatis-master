package com.djn.cn.sboot.mybatis.base.controller;


import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.sboot.mybatis.base.constants.RedisCacheConstants;
import com.djn.cn.sboot.mybatis.base.service.IAsynTaskService;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;
import com.djn.cn.sboot.mybatis.base.util.CacheClient;
import com.djn.cn.sboot.mybatis.base.util.CacheClientUtilFactory;





@Controller
public class TestController  {
	@Autowired
	private IAsynTaskService iAsynTaskService;
    @ResponseBody
    @RequestMapping(value = "/test")
    String home() {   
    	CountDownLatch countDownLatch = new CountDownLatch(10);
    	long startTime=System.currentTimeMillis();

		// 插入 1W 使用时间
		// 插入100W 使用时间
		
		try {
			int count = 1000;
			for (int i = 0; i < 10; i++) {
				iAsynTaskService.multipleThreadsInsertBatch(count,countDownLatch);		
			}
			countDownLatch.await();
			System.out.println("插入："+ (count * 10) +"条数据");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 long endTime=System.currentTimeMillis();
		 
	     System.out.println("程序运行时间： "+(endTime - startTime)/1000+"s");
        return "success";
    }

}
