package com.servicefeign.servicefeign.controller;

import com.servicefeign.servicefeign.feign_i.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestFeignController
 * @Description: TODO
 * @Author: xu
 * @Date: 2019/1/31 10:25
 * @Version: 1.0
 **/
@RestController
public class TestFeignController {

    @Autowired
    SchedualServiceHi service;

    @GetMapping(value = "/hi")
    public String say(@RequestParam(value = "name") String name){
       return service.fromClientOne(name);
    }
}
