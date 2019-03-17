package com.liu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**服务提供者
 * @author LiuJiangFeng
 * @ClassName: Qidong
 * @Date 2019/3/16 16:12
 */
@SpringBootApplication
@EnableEurekaClient
public class QidongClientTwo {

    public static void main(String[] args){

        SpringApplication.run(QidongClientTwo.class,args);
    }

    @Value("${server.port}")
    private int port;

    @RequestMapping("/index")
    public String index(){
        return "Hello World! ClientTwo,端口："+port;
    }
}
