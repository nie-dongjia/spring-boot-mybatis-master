package com.djn.cn.sboot.mybatis.base.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.djn.cn.sboot.mybatis.base.dao.TBTwoMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBTwo;
import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;
import com.djn.cn.sboot.mybatis.base.util.UUIDUtil;

@Service
public class TBTwoServiceImpl extends BaseServiceImpl<TBTwo> implements ITBTwoService {
	@Autowired
	private TBTwoMapper tBTwoMapper;

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	public void insertWithTransactional() {
		for (int i = 0; i < 10; i++) {
			TBTwo tBTwo = new TBTwo();
			tBTwo.setName("insertRuntimeExceptionWithTransactional聂冬佳:" + i);
			tBTwo.setCreateTime(new Date());
			tBTwo.setPublishDate(new Date());
			tBTwoMapper.insertSelective(tBTwo);
		}
		int i = 1 / 0;
		System.out.println(i);
	}

	@Override
	public void insertWithNoTransactionalNoRunTimeException() {
		for (int i = 0; i < 10; i++) {
			TBTwo tBTwo = new TBTwo();
			tBTwo.setName("insertRuntimeExceptionWithTransactional聂冬佳:" + i);
			tBTwo.setCreateTime(new Date());
			tBTwo.setPublishDate(new Date());
			tBTwoMapper.insertSelective(tBTwo);
		}
	}

	@Override
	public void insertWithNoTransactionalRunTimeException() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			TBTwo tBTwo = new TBTwo();
			tBTwo.setName("insertRuntimeExceptionWithTransactional聂冬佳:" + i);
			tBTwo.setCreateTime(new Date());
			tBTwo.setPublishDate(new Date());
			tBTwoMapper.insertSelective(tBTwo);
		}
		int i = 1 / 0;
		System.out.println(i);
	}

	@Override
	public void InsertBatch(int sumNum) {
		// 每次插入50个
		int time = sumNum / 100;
		for (int i = 0; i < time; i++) {
			List<TBTwo> tBTwos = new ArrayList<>();
			for (int j = 0; j < 100; j++) {
				TBTwo tBTwo = new TBTwo();
				tBTwo.setName("聂冬佳:" + j + UUIDUtil.create());
				tBTwo.setCreateTime(new Date());
				tBTwo.setPublishDate(new Date());
				tBTwo.setLockVersion(1L);
				tBTwos.add(tBTwo);
			}
			tBTwoMapper.insertList(tBTwos);
		}
	}

}
