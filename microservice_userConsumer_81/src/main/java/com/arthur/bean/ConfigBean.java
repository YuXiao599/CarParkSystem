package com.arthur.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    /*@Bean
    public IRule myRule(){
        //轮询策略，默认策略
        //return new RoundRobinRule();
        //随机策略
        return new RandomRule();
        //重试策略
        //return new RetryRule();
        //最低并发策略
        //return new BestAvailableRule();
        //可用过滤策略
        //return new BestAvailableRule();
    }*/
}
