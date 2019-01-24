package com.djn.cn.sboot.mybatis.base.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * 
 * @ClassName CacheClientUtilFactory
 * @Description  缓存工厂工具类改造   -- 采用工厂模式 定义工厂 利用不同的缓存实现 ,实现不同类型 的缓存切换   获取不同工厂的实现 
 * @author djnie
 * @date 2017年12月15日 上午9:14:11
 *
 */
@Component
public class CacheClientUtilFactory implements ApplicationContextAware
{
    // spring应用程序上下文环境
    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext)
    {
        CacheClientUtilFactory.applicationContext = applicationContext;
    }
    
    /**
     * 构造方法私有化
     */
    private CacheClientUtilFactory() 
    {
    }
    /**
     * 
     * @Title  createClient  
     * @return CacheClient   
     *	
     */
    public static CacheClient createClient(long timeOut)
    {
    	  // 最简单的情况，直接返回单个实例Redis访问客户端工具类
    	SingleRedisCacheClient cacheClient = applicationContext.getBean(SingleRedisCacheClient.class);
    	cacheClient.setTimeOut(timeOut);
        
        // TODO 可以根据需要扩展返回不同的缓存访问客户端
//        String isDistributedStr = ConfigurationHolder.getInstance().getProperty("redis.isDistributed");
//        if (StringUtils.isNotBlank(isDistributedStr))
//        {
//            boolean isDistributed = Boolean.valueOf(isDistributedStr);
//            if (isDistributed)
//            {
//                cacheClient = applicationContext.getBean(SharedRedisClient.class);
//            }
//            else
//            {
//                cacheClient = applicationContext.getBean(SingleRedisClient.class);
//            }
//        }
        
        return cacheClient;
    }
    /**
     * 
     * @Title  createClient  
     * @return CacheClient   
     *	
     */
    public static CacheClient createClient()
    {
    	// 最简单的情况，直接返回单个实例Redis访问客户端工具类
    	SingleRedisCacheClient cacheClient = applicationContext.getBean(SingleRedisCacheClient.class);    	
    	cacheClient.setTimeOut(3600);
    	return cacheClient;
    }
}
