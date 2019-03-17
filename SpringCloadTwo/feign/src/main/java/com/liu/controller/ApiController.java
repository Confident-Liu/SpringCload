package com.liu.controller;

import com.liu.Config.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuJiangFeng
 * @ClassName: ApiController
 * @Date 2019/3/16 23:39
 */
@RestController
public class ApiController {


    @Autowired
    private ApiService apiService;

    @RequestMapping("/index")
    public String index(){
        return apiService.index();
    }
}
