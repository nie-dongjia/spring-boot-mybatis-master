package com.djn.cn.sboot.mybatis.base.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.dao.TBTwoMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.entity.TBTwo;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;
import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;

import tk.mybatis.mapper.entity.Condition;
@Service
public class TBTwoServiceImpl extends BaseServiceImpl<TBTwo> implements ITBTwoService{
	@Autowired
	private TBTwoMapper tBTwoMapper;
	@Override
	public List<TBTwo> selectByCondition(Condition condition) {
		return tBTwoMapper.selectByCondition(condition);
	}
	@Override
	public void insertNoRuntimeException() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertRuntimeException() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertException() {
		// TODO Auto-generated method stub
		
	}

}
