package com.gongyuan.service.cache;

import com.gongyuan.model.dto.User;
import org.springframework.stereotype.Component;

/**
 * @author by TaoWangwang
 * @classname BaseRedisCacheImpl
 * @description 权限管理缓存适配器实现类
 * @date 2020/10/12 17:38
 */
@Component
public class UserRedisCacheHandlerAdapter extends AbstractRedisCacheHandlerAdapter<User> {


    /**
     * @param user
     * @param cacheName
     * @return
     */
    @Override
    public User insert(User user,String cacheName) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(String id,String cacheName) {
        return 0;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User update(User user,String cacheName) {
        return null;
    }

    /**
     * @param user
     * @return
     */
//    @Scheduled(cron = "25/55 * * * *")
    @Override
    public User select(User user,String cacheName) {
        return null;
    }

    @Override
    public String getDefaultCacheName() {
        return "user";
    }
}
