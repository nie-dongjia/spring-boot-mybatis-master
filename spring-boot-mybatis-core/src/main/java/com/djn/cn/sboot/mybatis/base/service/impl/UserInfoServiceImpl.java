package com.djn.cn.sboot.mybatis.base.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djn.cn.sboot.mybatis.base.dao.IUserInfoDAO;
import com.djn.cn.sboot.mybatis.base.entity.UserInfo;
import com.djn.cn.sboot.mybatis.base.service.IUserInfoService;
import com.djn.cn.sboot.mybatis.base.util.UUIDUtil;


@Service
@Transactional
public class UserInfoServiceImpl implements IUserInfoService {
	@Autowired
	private IUserInfoDAO iUserInfoDAO;
	@Override
	public void save(UserInfo userInfo) {	
		iUserInfoDAO.save(userInfo);
	}

    @Override
    public List<UserInfo> listAll() {
        return iUserInfoDAO.listAll();
    }

	@Override
	public void testTranslate() {
		UserInfo userInfo = new UserInfo();
		userInfo.setCreateTime(new Date());
		userInfo.setId(UUIDUtil.create());
		userInfo.setUserName("LiSi");
		userInfo.setPassword("123654");
		userInfo.setName("李四事务2");
		userInfo.setAge(26);
		userInfo.setEmail("468084221@qq.com");
		iUserInfoDAO.save(userInfo);
		int i = 5 / 0;
		System.out.println(i);
		UserInfo userInfo2 = new UserInfo();
		userInfo2.setCreateTime(new Date());
		userInfo2.setId(UUIDUtil.create());
		userInfo2.setUserName("LiSi");
		userInfo2.setPassword("123654");
		userInfo2.setName("李四事务3");
		userInfo2.setAge(26);
		userInfo2.setEmail("468084221@qq.com");
		iUserInfoDAO.save(userInfo2);
	}
	


}
