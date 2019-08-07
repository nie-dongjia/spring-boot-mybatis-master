package com.djn.cn.sboot.mybatis.base.controller;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.sboot.mybatis.base.service.IAsynTaskService;
import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;

@Controller
public class TestController {
	@Autowired
	private IAsynTaskService iAsynTaskService;
	@Autowired
	private ITBTwoService iTBTwoService;

	@ResponseBody
	@RequestMapping(value = "/test")
	String home() {
		CountDownLatch countDownLatch = new CountDownLatch(10);
		long startTime = System.currentTimeMillis();

		// 插入 1W 使用时间
		// 插入100W 使用时间

		try {
			int count = 10000;
			for (int i = 0; i < 10; i++) {
				iAsynTaskService.multipleThreadsInsertBatch(count, countDownLatch);
			}
			countDownLatch.await();
			System.out.println("插入1：" + (count * 10) + "条数据");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();

		System.out.println("程序运行时间1： " + (endTime - startTime) / 1000 + "s");
		return "success";
	}

	@ResponseBody
	@RequestMapping(value = "/test2")
	String test2() {
		long startTime = System.currentTimeMillis();
		// 插入 10W 使用时间
		// 插入100W 使用时间
		int count = 10000;
		for (int i = 0; i < 10; i++) {
			iTBTwoService.InsertBatch(count);
		}
		System.out.println("插入2：" + (count * 10) + "条数据");

		long endTime = System.currentTimeMillis();

		System.out.println("程序运行时间2： " + (endTime - startTime) / 1000 + "s");
		return "success2";
	}

}
// 插入1：100000条数据   
// 程序运行时间1： 11s
// 插入2：100000条数据
// 程序运行时间2： 28s


/***
 *  插入1：100000条数据
       程序运行时间1： 15s
       插入1：100000条数据
	程序运行时间1： 8s
	插入2：100000条数据
	程序运行时间2： 20s
	插入2：100000条数据
	程序运行时间2： 21s
	插入2：100000条数据  (第一次包含初始化)
	程序运行时间2： 25s
	插入2：100000条数据
	程序运行时间2： 20s
 * ***/
