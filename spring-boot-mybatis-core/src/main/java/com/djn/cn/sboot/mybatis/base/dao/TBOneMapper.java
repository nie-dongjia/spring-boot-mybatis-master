package com.djn.cn.sboot.mybatis.base.dao;

import java.util.List;

import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.util.MyMapper;

import tk.mybatis.mapper.entity.Condition;

public interface TBOneMapper extends MyMapper<TBOne> {
	List<TBOne> selectByCondition(Condition condition);
}