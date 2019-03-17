package com.liu.Config;

import org.springframework.stereotype.Component;

/**
 * @author LiuJiangFeng
 * @ClassName: ApiServiceError
 * @Date 2019/3/16 23:37
 */
@Component
public class ApiServiceError  implements ApiService  {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}
