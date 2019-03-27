package com.djn.cn.sboot.mybatis.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.sboot.mybatis.base.service.ITBOneService;
import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;
import com.djn.cn.sboot.mybatis.base.service.ITranslateTest;

@Service
public class TranslateTestImpl implements ITranslateTest{
	@Autowired 
	private ITBOneService iTBOneService;
	@Autowired 
	private ITBTwoService iTBTwoService;
	
	/**
	 * 
	 * insetLocalNoRuntimeException  本地insert NoRuntimeException 
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	private void insetLocalNoRuntimeException(){
		
	}
	/**
	 * 
	 * insetLocalRuntimeException  本地insert RuntimeException 
	 *   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	private void insetLocalRuntimeException(){
		
	}

	@Override
	public void testTranslateOne() {
		System.out.println("传播机制测试");
	}
}
