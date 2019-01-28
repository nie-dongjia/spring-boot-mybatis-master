package com.djn.cn.sboot.mybatis.master.test;




import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;



public class TKOneServiceTest extends AbstractTestCase {
	@Autowired
	private ITBOneService tBOneMapper;
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
	@Test
	public void tBOneMapperfindByConditionTest() {
		String name = "聂冬佳1";
		Condition condition = new Condition(TBOne.class);
        condition.createCriteria().andCondition("name.eq", name);
        List<TBOne> tBOnes = tBOneMapper.selectByCondition(condition);
        System.out.println("tBOnes:"+tBOnes.size());
	}
	@Test
	public void tBOneMapperfindByExampleTest() {
		String name = "聂冬佳";
		Example example = new Example(TBOne.class);
	    Example.Criteria criteria = example.createCriteria();
	    criteria.andEqualTo("name", name);
		List<TBOne> tBOnes = tBOneMapper.selectByExample(example);
		System.out.println("tBOnes:"+tBOnes.size());
	}
	
	
}
