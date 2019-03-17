package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * 链路追踪
 * @author LiuJiangFeng
 * @ClassName: ApplicationZipkin
 * @Date 2019/3/17 13:43
 */
@SpringBootApplication
@EnableZipkinServer
public class ApplicationZipkin {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZipkin.class,args);
    }
}
