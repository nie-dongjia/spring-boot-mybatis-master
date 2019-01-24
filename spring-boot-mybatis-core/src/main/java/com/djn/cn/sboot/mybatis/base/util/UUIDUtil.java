package com.djn.cn.sboot.mybatis.base.util;

import java.util.UUID;

/**
 * 
 * @ClassName UUIDUtil
 * @Description  UUID工具类 
 * @author djnie
 * @date 2017年3月9日 下午3:22:42
 *
 */
public class UUIDUtil {
	/**
	 * 生成UUID 
	 * @Title  create  
	 * @return String   
	 *
	 */
	public static String create(){
		return UUID.randomUUID().toString().replaceAll("\\-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(UUIDUtil.create());
		System.out.println(UUIDUtil.create().length());
	}
}
