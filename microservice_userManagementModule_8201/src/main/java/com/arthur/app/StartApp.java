package com.arthur.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @所在项目:testspringboothtml
 * @所在包:com.arthur.controller
 * @作者:arthur_wang
 * @创建时间:2020-09-19 19:47:36
 * @说明:
 **/
@ComponentScan("com.arthur")
@MapperScan(basePackages = "com.arthur.dao")
@EnableAutoConfiguration
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
