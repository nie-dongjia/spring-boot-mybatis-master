package com.djn.cn.sboot.mybatis.base.service;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * <b>类   名：</b>IAsynTaskService<br/>
 * <b>类描述：</b>异步多线程任务<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年8月5日 下午9:27:01<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年8月5日 下午9:27:01<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public interface IAsynTaskService {
	/**
	 * 
	 * multipleThreadsInsertBatch  多线程批量插入数据
	 *
	 * @param sumNum   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void multipleThreadsInsertBatch(int sumNum,CountDownLatch countDownLatch);
	void f1(CountDownLatch countDownLatch);
	void f2(CountDownLatch countDownLatch);
}
