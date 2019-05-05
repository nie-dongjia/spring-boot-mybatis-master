package com.djn.cn.sboot.mybatis.master.test;




import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;



public class TKOneServiceTest extends AbstractTestCase {
	@Autowired
	private ITBOneService iTBOneService;
	@Test
	public void tBOneMapperTest() {
		System.out.println("AAAAAAAAAAA:"+iTBOneService.selectAll());
	}
	
	@Test
	public void tBOneMapperAddTest() {
		for(int i = 0 ; i < 99;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			
			iTBOneService.insertSelective(tBOne);
			System.out.println(tBOne);
		}
		System.out.println("end");
	}
	@Test
	public void tBOneMapperfindByConditionTest() {
		String name = "聂冬佳";
		Condition condition = new Condition(TBOne.class);
        condition.createCriteria().andCondition("name = ", name);
        List<TBOne> tBOnes = iTBOneService.selectByCondition(condition);
        System.out.println("tBOnes:"+tBOnes.size());
	}
	@Test
	public void tBOneMapperfindByExampleTest() {
		String name = "聂冬佳";
		Example example = new Example(TBOne.class);
	    Example.Criteria criteria = example.createCriteria();
	    criteria.andEqualTo("name", name);
		List<TBOne> tBOnes = iTBOneService.selectByExample(example);
		System.out.println("tBOnes:"+tBOnes.size());
	}
	
	
}
