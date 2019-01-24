package com.djn.cn.sboot.mybatis.master.test;



import org.junit.Assert;
import org.junit.Test;

import com.djn.cn.sboot.mybatis.base.constants.RedisCacheConstants;
import com.djn.cn.sboot.mybatis.base.util.CacheClient;
import com.djn.cn.sboot.mybatis.base.util.CacheClientUtilFactory;




public class RedisTest extends AbstractTestCase {
	@Test
	public void redisTest() {
		CacheClient singleRedisCacheClient = CacheClientUtilFactory.createClient();
		singleRedisCacheClient.setCache(RedisCacheConstants.CACHE_KEY_MUDLE_NAME+"test2", "hello123");
		Assert.assertEquals(singleRedisCacheClient.getCache(RedisCacheConstants.CACHE_KEY_MUDLE_NAME+"test2"), "hello123");
		System.out.println(singleRedisCacheClient.getCache(RedisCacheConstants.CACHE_KEY_MUDLE_NAME+"test2"));
	}
	
}
