package com.djn.cn.sboot.mybatis.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.djn.cn.sboot.mybatis.base.service.IBaseService;
import com.djn.cn.sboot.mybatis.base.util.MyMapper;

import tk.mybatis.mapper.entity.Example;




public class BaseServiceImpl<T> implements IBaseService<T> {
	@Autowired
    private MyMapper<T> myMapper;
	@Override
	public T selectByPrimaryKey(Object entityId) {
		return myMapper.selectByPrimaryKey(entityId);
	}

	@Override
	public int deleteByPrimaryKey(Object entityId) {
		return myMapper.deleteByPrimaryKey(entityId);
	}

	@Override
	public int insert(T record) {
		return myMapper.insert(record);
	}

	@Override
	public int insertSelective(T record) {
		return myMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return myMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return myMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<T> selectAll() {
		return myMapper.selectAll();
	}

	@Override
	public List<T> selectByExample(Example example) {
		return myMapper.selectByExample(example);
	}

}
