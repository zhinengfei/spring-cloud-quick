package com.servicefeign.servicefeign.feign_i.impl;

import com.servicefeign.servicefeign.feign_i.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SchedualServiceHytrix
 * @Description: TODO
 * @Author: xu
 * @Date: 2019/1/31 11:51
 * @Version: 1.0
 **/
@Component
public class SchedualServiceHytrix implements SchedualServiceHi {
    @Override
    public String fromClientOne(String name) {
        return "sorry " + name;
    }
}
