package com.arthur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.arthur")
@EnableAutoConfiguration
@EnableEurekaClient
public class microservice_userConsumerStartApp_81 {
    public static void main(String[] args) {
        SpringApplication.run(microservice_userConsumerStartApp_81.class,args);
    }
}
