package com.djn.cn.sboot.mybatis.base.service.impl;

import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.djn.cn.sboot.mybatis.base.service.IAsynTaskService;

@Service
public class AsynTaskServiceImpl implements IAsynTaskService {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	@Async // 这里进行标注为异步任务，在执行此方法的时候，会单独开启线程来执行
	public void multipleThreadsInsertBatch(int sumNum) {

		// TODO Auto-generated method stub
	}

	@Override
	@Async("asyncServiceExecutor")
	public void f1() {
		System.out.println("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		logger.info("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		try {
			Thread.sleep(new Random().nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Async("asyncServiceExecutor")
	@Override
	public void f2() {
		System.out.println("f2 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		logger.info("f2 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
