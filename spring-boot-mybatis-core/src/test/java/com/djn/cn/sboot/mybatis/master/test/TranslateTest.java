package com.djn.cn.sboot.mybatis.master.test;





import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.sboot.mybatis.base.service.ITBOneService;




/**
 *  事务的传递机制 测试  与 总结
 * <b>类   名：</b>TranslateTest<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年3月26日 下午10:01:26<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年3月26日 下午10:01:26<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public class TranslateTest extends AbstractTestCase {
	@Autowired
	private ITBOneService iTBOneService;
	// 单方法RuntimeException测试事务结构:数据未插入  事务有效   
	@Test
	public void insertRuntimeExceptionWithTransactionalTest() {
		iTBOneService.insertRuntimeExceptionWithTransactional();		
	}
	// 单方法RuntimeException测试事务结构:数据插入     没事务当然全部插入
	@Test
	public void insertRuntimeExceptionWithNoTransactionalTest(){
		iTBOneService.insertRuntimeExceptionWithNoTransactional();
	}
	// 单方法Exception测试事务结构      数据插入      事务失效  ，接受RuntimeException 事务才会回滚
	@Test
	public void insertExceptionWithTransactionalTest(){
			iTBOneService.insertExceptionWithTransactional();
	}
	// 单方法Exception测试事务结构     手动回滚 
	@Test
	public void insertExceptionWithTransactionalPlusTest(){
		iTBOneService.insertExceptionWithTransactionalPlus();
	}
	
	// 本地service 本地事务方法调用本地非事务方法 事务依旧生效  
	@Test
	public void insertTransactionalCallNoTransactionalTest(){
			iTBOneService.insertTransactionalCallNoTransactional();
	}
	// 本地service 本地非事务方法  调用本地事务方法 非事务方法抛异常 事务没有生效
	@Test
	public void insertNoTransactionalCallTransactionalTest(){
			iTBOneService.insertNoTransactionalCallTransactional();
	}
	// 本地service 本地非事务方法  调用本地事务方法 事务方法抛异常   事务没有生效 
	@Test
	public void insertNoTransactionalCallTransactionalPlusTest(){
			iTBOneService.insertNoTransactionalCallTransactionalPlus();
	}
	
}
