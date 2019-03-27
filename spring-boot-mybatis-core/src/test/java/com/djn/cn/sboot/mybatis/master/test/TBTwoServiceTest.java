package com.djn.cn.sboot.mybatis.master.test;





import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;

public class TBTwoServiceTest extends AbstractTestCase {
	@Autowired
	private ITBTwoService iTBTwoService;
	@Test
	public void insertWithTransactionalTest() {
		iTBTwoService.insertWithTransactional();
	}
	@Test
	public void insertWithNoTransactionalNoRunTimeExceptionTest() {
		iTBTwoService.insertWithNoTransactionalNoRunTimeException();
	}
}
