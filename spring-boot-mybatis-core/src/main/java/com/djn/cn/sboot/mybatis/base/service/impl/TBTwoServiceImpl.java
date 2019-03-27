package com.djn.cn.sboot.mybatis.base.service.impl;




import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djn.cn.sboot.mybatis.base.dao.TBTwoMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBTwo;
import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;
@Service
public class TBTwoServiceImpl extends BaseServiceImpl<TBTwo> implements ITBTwoService{
	@Autowired
	private TBTwoMapper tBTwoMapper;

	@Override
	@Transactional
	public void insertWithTransactional() {
		for(int i = 0 ; i < 10;i ++ ){
			TBTwo tBTwo = new TBTwo();
			tBTwo.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBTwo.setCreateTime(new Date());
			tBTwo.setPublishDate(new Date());
			tBTwoMapper.insertSelective(tBTwo);
		}
		int i = 1 / 0 ;
		System.out.println(i);
	}

	@Override
	public void insertWithNoTransactionalNoRunTimeException() {
		for(int i = 0 ; i < 10;i ++ ){
			TBTwo tBTwo = new TBTwo();
			tBTwo.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBTwo.setCreateTime(new Date());
			tBTwo.setPublishDate(new Date());
			tBTwoMapper.insertSelective(tBTwo);
		}
	}

	@Override
	public void insertWithNoTransactionalRunTimeException() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10;i ++ ){
			TBTwo tBTwo = new TBTwo();
			tBTwo.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBTwo.setCreateTime(new Date());
			tBTwo.setPublishDate(new Date());
			tBTwoMapper.insertSelective(tBTwo);
		}
		int i = 1 / 0 ;
		System.out.println(i);
	}


}
