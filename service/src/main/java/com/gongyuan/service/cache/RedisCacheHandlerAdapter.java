package com.gongyuan.service.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author by TaoWangwang
 * @classname RedisCacheAdapter
 * @description RedisCache适配器，实现类需要用到@Cacheabel等注解实现自动缓存,具体可参考{@link ActionAuthRedisCacheHandlerAdapter}中的注解
 * @date 2020/10/12 17:32
 */
@SuppressWarnings("ALL")
public interface RedisCacheHandlerAdapter<T> extends CacheHandler{
    /**
     * 添加记录
     * @CachePut 往数据库新增或修改一条记录后会向redis中缓存该记录
     * value为配置文件中配置的缓存名称，spring.cache.cache-names=redisCache
     * key为redis中的键
     * @param t
     * @param cacheName
     */
    @CachePut(value = "redisCache",key = "#p1")
    T insert(T t, String cacheName);

    /**
     * 删除记录
     * @CacheEvict 调用该方法后会删除对应key的缓存
     * @param id
     * @param cacheName
     * @return
     */
    @CacheEvict(value = "redisCache",key = "#p1")
    int deleteByPrimaryKey(String id, String cacheName);

    /**
     * 修改记录
     * @CachePut 往数据库新增或修改一条记录后会向redis中缓存该记录
     * @param t
     * @param cacheName
     * @return
     */
    @CachePut(value = "redisCache",key = "#p1")
    T update(T t, String cacheName);

    /**
     * 查询记录
     * @Cacheable redis缓存中有值则先从缓存中获取，没有查数据库
     * @param t
     * @param cacheName
     * @return
     */
    @Cacheable(value = "redisCache",key = "#p1")
    T select(T t, String cacheName);
}
