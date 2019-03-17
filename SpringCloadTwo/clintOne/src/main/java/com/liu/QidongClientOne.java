package com.liu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**服务提供者
 * @author LiuJiangFeng
 * @ClassName: Qidong
 * @Date 2019/3/16 16:12
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class QidongClientOne {

    public static void main(String[] args){

        SpringApplication.run(QidongClientOne.class,args);
    }

    @Value("${server.port}")
    private int port;

    @RequestMapping("/index")
    public String index(){
        return "Hello World! ClientOne,端口："+port;
    }

}
