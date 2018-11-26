package com.liujie.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/11/13 21:03
*/
@Service
public class AsyncTaskService {

    @Async
    public void print(Integer i){
        //Async注解在方法上，表明为一个异步方法，如果注解在类上，表明类中的所有方法都是异步方法
        System.out.println("执行异步任务打印数字：" + i);
    }


    @Async
    public void printName(String name){
        System.out.println("执行异步任务打印名称：" + name);
    }
}
