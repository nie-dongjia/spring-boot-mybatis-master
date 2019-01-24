package com.djn.cn.sboot.mybatis.master.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.djn.cn.sboot.mybatis.base.entity.UserInfo;
import com.djn.cn.sboot.mybatis.base.service.IUserInfoService;



public class UserInfoServiceTest extends AbstractTestCase {
	@Value("${message.mail}")
	private String mail;
	@Autowired
	private IUserInfoService iUserInfoService;
	@Test
	public void listAllTest() {
		int i  =  iUserInfoService.listAll().size();
		System.out.println(i);
		System.out.println(mail);
		
	}
	@Test
	public void addTest() {
		UserInfo userInfo= new UserInfo();
		userInfo.setId(UUID.randomUUID().toString());
		userInfo.setName("test");
		userInfo.setCreateTime(new Date());
		iUserInfoService.save(userInfo);
	}
	@Test
	public void testTranslateTest() {
		iUserInfoService.testTranslate();
	}
}
