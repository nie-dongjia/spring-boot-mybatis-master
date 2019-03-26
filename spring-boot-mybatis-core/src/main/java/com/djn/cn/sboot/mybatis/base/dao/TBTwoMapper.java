package com.djn.cn.sboot.mybatis.base.dao;

import java.util.List;

import com.djn.cn.sboot.mybatis.base.entity.TBTwo;
import com.djn.cn.sboot.mybatis.base.util.MyMapper;

import tk.mybatis.mapper.entity.Condition;

public interface TBTwoMapper extends MyMapper<TBTwo> {
	List<TBTwo> selectByCondition(Condition condition);
}