package com.djn.cn.sboot.mybatis.base.service;






import com.djn.cn.sboot.mybatis.base.entity.TBTwo;



public interface ITBTwoService extends IBaseService<TBTwo>{
	void insertWithTransactional();
	void insertWithNoTransactionalNoRunTimeException();
	void insertWithNoTransactionalRunTimeException();
}
