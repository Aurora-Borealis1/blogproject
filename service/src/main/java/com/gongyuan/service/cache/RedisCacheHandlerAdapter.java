package com.gongyuan.service.cache;

/**
 * @author by TaoWangwang
 * @classname RedisCacheAdapter
 * @description RedisCache适配器，实现类需要用到@Cacheabel等注解实现自动缓存,具体可参考{@link ActionAuthRedisCacheHandlerAdapter}中的注解
 * @date 2020/10/12 17:32
 */
public interface RedisCacheHandlerAdapter<T> extends CacheHandler{
    /**
     * 添加记录
     * @param t
     */
    int insert(T t);

    /**
     * 删除记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 修改记录
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 查询记录
     * @param t
     * @return
     */
    T select(T t);
}
