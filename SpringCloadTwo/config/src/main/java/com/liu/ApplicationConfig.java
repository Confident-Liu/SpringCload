package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**配置管理
 * @author LiuJiangFeng
 * @ClassName: ApplicationConfig
 * @Date 2019/3/17 9:02
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ApplicationConfig {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class,args);
    }

}
