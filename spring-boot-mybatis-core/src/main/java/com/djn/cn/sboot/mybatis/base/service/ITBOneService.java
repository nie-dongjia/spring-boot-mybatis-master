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
	/**
	 * 
	 * insertNoRuntimeException  循环插入 没有 抛RuntimeException 
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void insertNoRuntimeException ();
	/**
	 * 
	 * insertRuntimeException  循环插入 抛RuntimeException 
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void insertRuntimeException();
	/**
	 * 
	 * insertException  循环插入 抛Exception 
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void insertException();
	/**
	 * 
	 * insertTranslateOne  TODO
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void insertTranslateOne();
}
