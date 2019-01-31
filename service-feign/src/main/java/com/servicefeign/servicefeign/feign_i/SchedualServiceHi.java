package com.servicefeign.servicefeign.feign_i;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/***
 * @Author luopengfei
 * @Description 定义一个feign接口，来指定调用哪个服务，这里调用servi-hi服务的hi接口
 * @Date  2019/1/31
 * @Param
 * @return
 **/
@FeignClient(value = "SERVICE-HI")
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String fromClientOne(@RequestParam(value = "name") String name );
}
