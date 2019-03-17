package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LiuJiangFeng
 * @ClassName: Qidong
 * @Date 2019/3/16 15:49
 */
@SpringBootApplication
@EnableEurekaServer
public class QidongService {
    public static void main(String[] args) {
        SpringApplication.run(QidongService.class, args);
    }
}
