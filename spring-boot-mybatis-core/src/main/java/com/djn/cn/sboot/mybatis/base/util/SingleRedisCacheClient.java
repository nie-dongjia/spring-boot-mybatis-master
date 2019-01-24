package com.djn.cn.sboot.mybatis.base.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;


/**
 * 
 * @ClassName SingleRedisCacheClient
 * @Description  redis缓存客户端，提供缓存操作方法（单台Redis服务器时使用）
 * @author djnie
 * @date 2017年12月15日 上午10:27:45
 *
 */
@Component
public class SingleRedisCacheClient implements CacheClient
{
    /**
     * redis访问模板
     */
	@Autowired
    private RedisTemplate<String, String> redisTemplate;
    /**缓存时间 */
    private long timeOut;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 
     * getCache(通过key获取缓存数据)
     * 
     * @param key 写入redis的key值
     * @return String 对应的数据
     * @since 1.0
     * @author djnie
     */
    @Override
    public String getCache(String key)
    {
        try
        {
            ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
            return valueOperations.get(key) == null ? "" : valueOperations.get(key).toString();
        }
        catch (RedisConnectionFailureException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 
     * multiGetCaches(获取多个key对应的缓存数据)
     * 
     * @param key redis的key值，可以为多个
     * @return List 对应的值，若key值不存在则返回null
     * @since 1.0
     * @author djnie
     */
    @Override
    public List<String> multiGetCaches(String... key)
    {
        try
        {
            if (null != key && key.length > 0)
            {
                Collection<String> collection = Arrays.asList(key);
                ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
                List<String> list = valueOperations.multiGet(collection);
                if (null != list && list.size() > 0)
                {
                    return list;
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }
        catch (RedisConnectionFailureException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
        
    }

    /**
     * 
     * setCache(将数据写入redis)
     * 
     * @param key 写入redis的key值
     * @param value 写入redis的数据
     * @since 1.0
     * @author djnie
     */
    @Override
    public void setCache(String key, String value)
    {
        setCacheWithExpire(key, value, timeOut);
    }

    /**
     * 
     * setCacheWithExpire(将数据写入redis，并设置过期时间)
     * 
     * @param key 写入redis的key值
     * @param value 写入redis的数据
     * @param timeOut 过期时间，单位秒
     * @since 1.0
     * @author djnie
     */
    @Override
    public void setCacheWithExpire(String key, String value, long timeOut)
    {
        try
        {
            ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
            valueOperations.set(key, value, timeOut, TimeUnit.SECONDS);
        }
        catch (RedisConnectionFailureException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public String getModuleName()
    {
        return moduleName;
    }
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }
    public long getTimeOut()
    {
        return timeOut;
    }
    public void setTimeOut(long timeOut)
    {
        this.timeOut = timeOut;
    }
}
