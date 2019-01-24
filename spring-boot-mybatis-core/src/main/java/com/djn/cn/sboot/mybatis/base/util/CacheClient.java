package com.djn.cn.sboot.mybatis.base.util;

import java.util.List;


/**
 * 
 * @ClassName CacheClient
 * @Description 缓存访问客户端接口（定义缓存工具类方法）
 * @author djnie
 * @date 2017年12月15日 上午10:18:08
 *
 */
public interface CacheClient
{
    /**
     * 
     * getCache(根据键值取得缓存对应数据)
     * 
     * @param key 键值
     * @return 缓存对应的数据
     * @since 1.0
     * @author djnie
     */
    public String getCache(String key);
    
    /**
     * 
     * multiGetCaches(从缓存中取得多个数据)
     * 
     * @param keys 键值列表
     * @return 缓存中对应的多个值列表
     * @since 1.0
     * @author djnie
     */
    public List<String> multiGetCaches(String... keys);
    
    /**
     * 
     * setCache(设置缓存)
     * 
     * @param key 键值
     * @param value 缓存内容
     * @since 1.0
     * @author djnie
     */
    public void setCache(String key, String value);
    
    /**
     * 
     * setCacheWithExpire(设置固定时间自动过期的缓存)
     * 
     * @param key 键值
     * @param value 缓存内容
     * @param timeout 过期时间（单位：秒）
     * @since 1.0
     * @author djnie
     */
    public void setCacheWithExpire(String key, String value, long timeout);
}
