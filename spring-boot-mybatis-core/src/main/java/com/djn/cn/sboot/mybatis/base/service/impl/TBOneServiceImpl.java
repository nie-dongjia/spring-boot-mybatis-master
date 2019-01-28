package com.djn.cn.sboot.mybatis.base.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;

import tk.mybatis.mapper.entity.Condition;
@Service
public class TBOneServiceImpl extends BaseServiceImpl<TBOne> implements ITBOneService{
	@Autowired
	private TBOneMapper tBOneMapper;
	@Override
	public List<TBOne> selectByCondition(Condition condition) {
		return tBOneMapper.selectAll();
	}

}
