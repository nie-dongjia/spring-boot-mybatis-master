package com.djn.cn.sboot.mybatis.master.test;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.IAsynTaskService;

public class IAsynTaskServiceTest extends AbstractTestCase {
	private final CountDownLatch countDownLatch = new CountDownLatch(10);
	@Autowired
	private IAsynTaskService iAsynTaskService;
	@Autowired
	private TBOneMapper tBOneMapper; // 这个是单例 性能并没有本质提升 
	// 单方法RuntimeException测试事务结构:数据未插入 事务有效
	@Test
	public void iAsynTaskServiceTest() {
		long startTime=System.currentTimeMillis();
		try {
			for (int i = 0; i < 5; i++) {
				iAsynTaskService.f1(countDownLatch); // 执行异步任务
				iAsynTaskService.f2(countDownLatch);
			}
			countDownLatch.await();
			System.out.println("线程执行完成");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
	}

	@Test
	public void multipleThreadsInsertBatchTest() {
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
	}
	@Test
	public void iAddSingleTest() {
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			TBOne tBOne = new TBOne();
			tBOne.setName("聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);	
		}
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
	}

}
