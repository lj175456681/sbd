package com.liujie.service.config;


import com.alibaba.fastjson.JSON;
import com.liujie.service.properties.TaskExecutorProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.concurrent.Executor;

/**
 * @Description: 线程池
 * @author : liujie
 * @Date: 2018/7/19 15:49
*/
@Configuration
@EnableAsync
@Slf4j
public class TaskExecutorConfig implements AsyncConfigurer {

    private static final String DEFAULT_THREAD_NAME_PREFIX = "Thread-liujie-";

    @Resource
    private TaskExecutorProperties properties;

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
        threadPool.setCorePoolSize(properties.getCorePoolSize());
        threadPool.setMaxPoolSize(properties.getMaxPoolSize());
        threadPool.setQueueCapacity(properties.getQueueCapacity());
        threadPool.setKeepAliveSeconds(properties.getKeepAliveSeconds());
        threadPool.setAllowCoreThreadTimeOut(properties.isAllowCoreThreadTimeOut());
        threadPool.setThreadNamePrefix(DEFAULT_THREAD_NAME_PREFIX);
        threadPool.initialize();
        return threadPool;
    }


    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return (ex, method, params) -> log.error("执行异步任务发生异常，方法：{}，参数：{}，具体的异常信息:{}"
                ,method.getName(), JSON.toJSONString(params),ex.getMessage());
    }
}
