package com.liu.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**获取RedissonClient连接类
 * @author LiuJiangFeng
 * @ClassName: RedissonConnector
 * @Date 2019/3/17 21:16
 */
@Component
public class RedissonConnector {

    RedissonClient redisson;
    @PostConstruct
    public void init(){
        redisson = Redisson.create();
    }

    public RedissonClient getClient(){
        return redisson;
    }
}
