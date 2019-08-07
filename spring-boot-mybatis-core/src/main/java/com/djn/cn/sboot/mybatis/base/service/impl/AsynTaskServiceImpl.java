package com.djn.cn.sboot.mybatis.base.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.IAsynTaskService;
import com.djn.cn.sboot.mybatis.base.util.UUIDUtil;

@Service
public class AsynTaskServiceImpl implements IAsynTaskService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private TBOneMapper tBOneMapper; // 这个是单例 性能并没有本质提升 
	@Override
	@Async("asyncServiceExecutor") // 这里进行标注为异步任务，在执行此方法的时候，会单独开启线程来执行
	public void multipleThreadsInsertBatch(int sumNum,CountDownLatch countDownLatch) {
		// 每次插入50个 
		int time = sumNum/100;
		for(int i = 0 ; i < time ;i ++ ){
			List<TBOne> tBOnes = new ArrayList<>();
			for(int j = 0 ; j < 100 ;j ++ ){
				TBOne tBOne = new TBOne();
				tBOne.setName("聂冬佳:"+j+UUIDUtil.create());
				tBOne.setCreateTime(new Date());
				tBOne.setPublishDate(new Date());
				tBOne.setLockVersion(1L);
				tBOnes.add(tBOne);
			}
			tBOneMapper.insertList(tBOnes);
		}
		countDownLatch.countDown();
	}
	@Override
	@Async("asyncServiceExecutor")
	public void f1(CountDownLatch countDownLatch) {
		System.out.println("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		logger.info("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		try {
			Thread.sleep(new Random().nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		countDownLatch.countDown();
	}

	@Async("asyncServiceExecutor")
	@Override
	public void f2(CountDownLatch countDownLatch) {
		System.out.println("f2 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		logger.info("f2 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		try {
			Thread.sleep(new Random().nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		countDownLatch.countDown();
	}

}
