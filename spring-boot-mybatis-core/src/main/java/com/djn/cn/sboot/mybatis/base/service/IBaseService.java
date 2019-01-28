package com.djn.cn.sboot.mybatis.base.service;

import java.util.List;

import tk.mybatis.mapper.entity.Example;

/**
 * 
 * <b>类 名：</b>ICommonService<br/>
 * <b>类描述：</b>通用service接口<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年1月28日 下午9:14:37<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年1月28日 下午9:14:37<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 *
 */
public interface IBaseService<T> {
	T selectByPrimaryKey(Object entityId);

	int deleteByPrimaryKey(Object entityId);

	int insert(T record);

	int insertSelective(T record);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

	List<T> selectAll();
	
	List<T> selectByExample(Example example);
}
