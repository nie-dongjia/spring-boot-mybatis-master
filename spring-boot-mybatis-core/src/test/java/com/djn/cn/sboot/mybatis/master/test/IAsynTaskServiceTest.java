package com.djn.cn.sboot.mybatis.master.test;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.sboot.mybatis.base.service.IAsynTaskService;

public class IAsynTaskServiceTest extends AbstractTestCase {
	private final CountDownLatch countDownLatch = new CountDownLatch(10);
	@Autowired
	private IAsynTaskService iAsynTaskService;

	// 单方法RuntimeException测试事务结构:数据未插入 事务有效
	@Test
	public void iAsynTaskServiceTest() {
		try {
			for (int i = 0; i < 10; i++) {
				iAsynTaskService.f1(); // 执行异步任务
				iAsynTaskService.f2();
			}
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END");
	}

}
