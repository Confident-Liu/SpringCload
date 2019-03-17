package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**注册中心，服务网关
 * @author LiuJiangFeng
 * @ClassName: ApplicationGateway
 * @Date 2019/3/16 19:08
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApplicationGateway {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationGateway.class, args);
    }

    /**
     * zuul 添加过滤器
     * @return
     */
    /*@Bean
    public ApiFilterTwo tokenFilter() {
        return new ApiFilterTwo();
    }*/

}
