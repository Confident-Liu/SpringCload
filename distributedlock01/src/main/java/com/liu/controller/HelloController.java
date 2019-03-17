package com.liu.controller;

import com.liu.config.AquiredLockWorker;
import com.liu.config.DistributedLockHandler;
import com.liu.config.DistributedLocker;
import com.liu.config.Lock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuJiangFeng
 * @ClassName: HelloController
 * @Date 2019/3/17 20:53
 */
@RestController
public class HelloController {

   /* @Autowired
    private DistributedLockHandler distributedLockHandler;

    @RequestMapping("index")
    public String index(){
        Lock lock=new Lock("lynn","min");
        if(distributedLockHandler.tryLock(lock)){
            try {
                //为了演示锁的效果，这里睡眠5000毫秒
                System.out.println("执行方法");
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
            distributedLockHandler.releaseLock(lock);
        }
        return "hello world!";
    }*/


    @Autowired
    private DistributedLocker distributedLocker;

    @RequestMapping("index")
    public String index()throws Exception{
        distributedLocker.lock("test",new AquiredLockWorker<Object>() {

            @Override
            public Object invokeAfterLockAquire() {
                try {
                    System.out.println("执行方法！");
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }

        });
        return "hello world!";
    }
}
