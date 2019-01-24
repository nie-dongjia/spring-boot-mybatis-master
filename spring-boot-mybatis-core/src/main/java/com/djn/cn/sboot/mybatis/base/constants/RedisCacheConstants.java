package com.djn.cn.sboot.mybatis.base.constants;

/**
 * 
 * @ClassName RedisCacheConstants
 * @Description  RedisCache常量类 
 * @author djnie
 * @date 2017年12月15日 下午1:40:49
 *
 */
public class RedisCacheConstants {
	/**缓存10分钟*/
	public static final Long CACHE_XS_EXPIRE  = 600L;
	/**缓存1个小时*/
	public static final Long CACHE_S_EXPIRE   = 3600L;
	/**缓存6个小时*/
	public static final Long CACHE_M_EXPIRE   = 21600L;
	/**缓存12个小时*/
	public static final Long CACHE_L_EXPIRE   = 43200L;
	/**缓存24个小时*/
	public static final Long CACHE_XL_EXPIRE    = 86400L;
	/**KEY模块名*/
	public static final String CACHE_KEY_MUDLE_NAME  = "SP:MYBATIS:MASTER:";
}
