package com.djn.cn.sboot.mybatis.order.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.sboot.mybatis.base.entity.TBOne;
import com.djn.cn.sboot.mybatis.base.service.ITBOneService;



/**
 * 
 * <b>类   名：</b>OrderInfoController<br/>
 * <b>类描述：</b>订单测试<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年5月12日 下午11:20:54<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年5月12日 下午11:20:54<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@Controller
@RequestMapping(value = "/order")
public class OrderInfoController  {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private ITBOneService iTKOneService;
    @ResponseBody
    @RequestMapping(value = "/list")
    Object list() {   
    	logger.debug("debug");
    	logger.info("info");
    	logger.error("error");
    	return iTKOneService.selectAll();
    }
    @ResponseBody
    @RequestMapping(value = "/add")
    Object add() {   
    	// 订单生成  
    	// 要求H5 防重复提交 满足大并发 方案    redis 方案   Or    
    	return "success";
    }
    // 订单状态改变 ->提交(待付款)
    @ResponseBody
    @RequestMapping(value = "/update-one-step")
    Object updateOne() {   
    	// 单据状态在多界面与高并发下，状态不会出现错误
    	return "success";
    }
    // 订单状态改变 ->提交(已付款)
    @ResponseBody
    @RequestMapping(value = "/update-two-step")
    Object updateTwo() {   
    	// 单据状态在多界面与高并发下，状态不会出现错误
    	return "success";
    }
    // 订单物品栏  子单据业务状态研究    
    // 订单物品状态 初始化0（预）1 待发货  2 已发货 3  
    // 
    // 多界面  多客户端 状态错乱问题  业务状态的强控 或者乐观锁（不能100%）
    
    
    
    	
}
