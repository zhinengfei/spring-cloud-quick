package com.serverribbon.serverribbon.controller;

import com.serverribbon.serverribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Author: xu
 * @Date: 2019/1/30 17:33
 * @Version: 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam("name") String name){
      return service.hi(name);
    }
}
