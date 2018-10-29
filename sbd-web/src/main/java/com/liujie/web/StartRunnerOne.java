package com.liujie.web;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description: spring所有的bean加载完毕，spring boot SpringApplication.run() 之前执行,用于初始化操作。
 * order注解用户定义加载的先后顺序，越小越先加载
 * @author : liujie
 * @Date: 2018/8/6 10:06
*/
@Component
@Order(1)
public class StartRunnerOne implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("the startRunner one initialized...");
    }
}
