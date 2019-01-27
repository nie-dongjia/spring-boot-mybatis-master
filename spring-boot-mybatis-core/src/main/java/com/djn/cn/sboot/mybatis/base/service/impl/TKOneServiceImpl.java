package com.djn.cn.sboot.mybatis.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.ITKOneService;
@Service
public class TKOneServiceImpl implements ITKOneService{
	@Autowired
	private TBOneMapper tBOneMapper;
	@Override
	public List<TBOne> listAll() {
		return tBOneMapper.selectAll();
	}

}
