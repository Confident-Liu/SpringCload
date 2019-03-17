package com.liu.config;

/**创建全局锁类
 * @author LiuJiangFeng
 * @ClassName: Lock
 * @Date 2019/3/17 20:50
 */
public class Lock {


    private String name;
    private String value;

    public Lock(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
