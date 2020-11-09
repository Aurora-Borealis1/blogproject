package com.gongyuan.service.cache;

import com.gongyuan.model.dto.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author by TaoWangwang
 * @classname BaseRedisCacheImpl
 * @description 权限管理缓存适配器实现类
 * @date 2020/10/12 17:38
 */
@Component
public class UserRedisCacheHandlerAdapter implements RedisCacheHandlerAdapter<User> {


    /**
     * @CachePut 往数据库新增或修改一条记录后会向redis中缓存该记录
     * value为配置文件中配置的缓存名称，spring.cache.cache-names=redisCache
     * key为redis中的键
     * @param user
     * @return
     */
    @CachePut(value = "redisCache",key = "'redis_user'")
    @Override
    public int insert(User user) {
        return 0;
    }

    /**
     * @CacheEvict 调用该方法后会删除对应key的缓存
     * @param id
     * @return
     */
    @CacheEvict(value = "redisCache",key = "'redis_user'")
    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    /**
     * @CachePut 往数据库新增或修改一条记录后会向redis中缓存该记录
     * @param user
     * @return
     */
    @CachePut(value = "redisCache",key = "'redis_user'")
    @Override
    public int update(User user) {
        return 0;
    }

    /**
     * @Cacheable redis缓存中有值则先从缓存中获取，没有查数据库
     * @param user
     * @return
     */
    @Cacheable(value = "redisCache",key = "'redis_user'")
//    @Scheduled(cron = "25/55 * * * *")
    @Override
    public User select(User user) {
        return null;
    }
}
