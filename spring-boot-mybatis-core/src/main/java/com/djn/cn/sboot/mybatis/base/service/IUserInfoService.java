package com.djn.cn.sboot.mybatis.base.service;

import java.util.List;

import com.djn.cn.sboot.mybatis.base.entity.UserInfo;

public interface IUserInfoService {
	void testTranslate();
	/**
	 * 增加一个用户
	 * @Title  save  
	 * @return void   
	 *
	 */
	void save(UserInfo userInfo);
	/**
	 * 查询所有
	 * @Title  listAll  
	 * @return List<UserInfo>   
	 *
	 */
	List<UserInfo> listAll();
	
	
	
}
