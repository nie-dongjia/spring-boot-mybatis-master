package com.djn.cn.sboot.mybatis.master.test;




import java.util.Date;

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
		for(int i = 0 ; i < 99;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			
			tBOneMapper.insertSelective(tBOne);
		}
		System.out.println("end");
	}
	
}
