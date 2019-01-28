package com.djn.cn.sboot.mybatis.base.service;



import java.util.List;

import com.djn.cn.sboot.mybatis.base.entity.TBOne;

import tk.mybatis.mapper.entity.Condition;

public interface ITBOneService extends IBaseService<TBOne>{
	/**
	 * 
	 * selectByCondition  TODO
	 *
	 * @param condition
	 * @return   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	List<TBOne> selectByCondition(Condition condition);
}
