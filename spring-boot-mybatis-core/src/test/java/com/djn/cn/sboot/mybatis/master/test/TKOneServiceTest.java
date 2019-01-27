package com.djn.cn.sboot.mybatis.master.test;




import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;



public class TKOneServiceTest extends AbstractTestCase {
	@Autowired
	private TBOneMapper tBOneMapper;
	@Test
	public void tBOneMapperTest() {
		System.out.println("AAAAAAAAAAA:"+tBOneMapper.selectAll());
	}
	
	@Test
	public void tBOneMapperAddTest() {
		TBOne tBOne = new TBOne();
		tBOne.setName("聂冬佳");
		tBOneMapper.insertSelective(tBOne);
		System.out.println(tBOne);
	}
	
}
