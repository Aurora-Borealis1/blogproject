package com.gongyuan.service.cache;

/**
 * @author Tww
 * @date 2020/11/12 14:03
 */
public abstract class AbstractRedisCacheHandlerAdapter<T> implements RedisCacheHandlerAdapter<T>{

    /**
     * 添加记录
     * @CachePut 往数据库新增或修改一条记录后会向redis中缓存该记录
     * @param t
     */
    public final T insert(T t){
        return insert(t,getDefaultCacheName());
    }

    /**
     * 删除记录
     * @CacheEvict 调用该方法后会删除对应key的缓存
     * @param id
     * @return
     */
    public final int deleteByPrimaryKey(String id){
        return deleteByPrimaryKey(id,getDefaultCacheName());
    }

    /**
     * 修改记录
     * @CachePut 往数据库新增或修改一条记录后会向redis中缓存该记录
     * @param t
     * @return
     */
    public final T update(T t){
        return update(t,getDefaultCacheName());
    }

    /**
     * 查询记录
     * @Cacheable redis缓存中有值则先从缓存中获取，没有查数据库
     * @param t
     * @return
     */
    public final T select(T t){
        return select(t,getDefaultCacheName());
    }
}
