package com.djn.cn.sboot.mybatis.base.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.djn.cn.sboot.mybatis.base.dao.TBOneMapper;
import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;
import com.djn.cn.sboot.mybatis.base.service.ITBTwoService;

import tk.mybatis.mapper.entity.Condition;
@Service
public class TBOneServiceImpl extends BaseServiceImpl<TBOne> implements ITBOneService{
	@Autowired
	private TBOneMapper tBOneMapper;
	@Autowired
	private ITBTwoService iTBTwoService;
	@Override
	public List<TBOne> selectByCondition(Condition condition) {
		return tBOneMapper.selectByCondition(condition);
	}
	@Override
	public void insertNoRuntimeException() {
		// TODO Auto-generated method stub
		
	}
	@Override
	@Transactional
	public void insertRuntimeExceptionWithTransactional() {
		for(int i = 0 ; i < 10;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		int i = 10 / 0 ;
	}
	@Override
	public void insertException() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertTranslateOne() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertRuntimeException() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertRuntimeExceptionWithNoTransactional() {
		for(int i = 0 ; i < 10;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		
		int i = 10 / 0 ;
		
	}
	@Override
	@Transactional
	public void insertExceptionWithTransactional(){
		try {
			for(int i = 0 ; i < 10;i ++ ){
				TBOne tBOne = new TBOne();
				tBOne.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
				tBOne.setCreateTime(new Date());
				tBOne.setPublishDate(new Date());
				tBOneMapper.insertSelective(tBOne);
			}
			throw new Exception("发生Exception异常");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	@Transactional
	public void insertTransactionalCallNoTransactional() {
		for(int i = 0 ; i < 5;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("TBOne:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		insertNoTransactional();
		int i = 10 / 0 ;
	}
	private void insertNoTransactional(){
		for(int i = 0 ; i < 5;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("TBOne:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
	}
	@Transactional
	private void insertTransactional(){
		for(int i = 0 ; i < 5;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("TBOne:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
	}
	@Transactional
	private void insertTransactionalRunTimeException(){
		for(int i = 0 ; i < 5;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("TBOne:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		int i = 10 / 0 ;
	}
	@Override
	public void insertNoTransactionalCallTransactional() {
		for(int i = 0 ; i < 5;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("TBOne:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		insertTransactional();
		int i = 10 / 0 ;
	}
	@Override
	public void insertNoTransactionalCallTransactionalPlus() {
		for(int i = 0 ; i < 5;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("TBOne:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		insertTransactionalRunTimeException();
	}
	@Override
	@Transactional
	public void insertExceptionWithTransactionalPlus() {
		try {
			for(int i = 0 ; i < 10;i ++ ){
				TBOne tBOne = new TBOne();
				tBOne.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
				tBOne.setCreateTime(new Date());
				tBOne.setPublishDate(new Date());
				tBOneMapper.insertSelective(tBOne);
			}
			throw new Exception("发生Exception异常");
		} catch (Exception e) {
			// 手动回滚
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			e.printStackTrace();
		}
		
		
	}
	@Override
	@Transactional
	public void transactionalCallNoTransactionalNoException() {
		for(int i = 0 ; i < 10;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		iTBTwoService.insertWithNoTransactionalNoRunTimeException();
		int i = 1 /0;
	}
	@Override
	public void noTransactionalCallTransactional() {
		for(int i = 0 ; i < 10;i ++ ){
			TBOne tBOne = new TBOne();
			tBOne.setName("insertRuntimeExceptionWithTransactional聂冬佳:"+i);
			tBOne.setCreateTime(new Date());
			tBOne.setPublishDate(new Date());
			tBOneMapper.insertSelective(tBOne);
		}
		iTBTwoService.insertWithTransactional();
	}



}
