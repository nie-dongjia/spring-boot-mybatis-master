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
	/**
	 * 
	 * insertRuntimeExceptionWithTransactional  TODO
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void insertRuntimeExceptionWithTransactional();
	void insertRuntimeExceptionWithNoTransactional();
	void insertExceptionWithTransactional();
	void insertExceptionWithTransactionalPlus();
	void insertTransactionalCallNoTransactional();
	void insertNoTransactionalCallTransactional();
	void insertNoTransactionalCallTransactionalPlus();
	
	
	// 不同service事务  调用分析
	void transactionalCallNoTransactionalNoException();
	void noTransactionalCallTransactional();
	
	/**
	 * 
	 * multipleThreadsInsertBatch  多线程批量插入数据
	 *
	 * @param sumNum   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	void multipleThreadsInsertBatch(int sumNum);
	
	
	
	
	
	
	

}
