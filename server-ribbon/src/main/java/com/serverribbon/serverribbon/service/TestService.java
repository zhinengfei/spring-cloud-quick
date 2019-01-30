package com.serverribbon.serverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: TestService
 * @Description: TODO
 * @Author: xu
 * @Date: 2019/1/30 17:29
 * @Version: 1.0
 **/
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String hi(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
