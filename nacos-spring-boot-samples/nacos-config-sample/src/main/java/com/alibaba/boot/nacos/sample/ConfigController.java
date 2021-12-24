package com.alibaba.boot.nacos.sample;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author： gy.sz
 * @date： 2021/12/24
 * @description：
 * @modifiedBy：
 */
@Controller
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @NacosValue(value = "${test:this is a default value}", autoRefreshed = true)
    private String test;

    @RequestMapping(value = "/get")
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return test;
    }
}
