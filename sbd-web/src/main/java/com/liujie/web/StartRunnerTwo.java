package com.liujie.web;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/6 10:07
*/
@Component
@Order(2)
public class StartRunnerTwo implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("the startRunner two initialized...");
    }
}
