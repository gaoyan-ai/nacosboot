package com.alibaba.boot.nacos.sample;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author： gy.sz
 * @date： 2021/12/24
 * @description：
 * @modifiedBy：
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosConfigApplication {
    public static void main(String[] args){
        SpringApplication.run(NacosConfigApplication.class, args);
    }
}


