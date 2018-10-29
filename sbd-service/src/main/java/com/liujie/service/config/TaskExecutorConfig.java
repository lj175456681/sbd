package com.liujie.service.config;


import com.alibaba.fastjson.JSON;
import com.liujie.service.properties.TaskExecutorProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
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
public class TaskExecutorConfig implements AsyncConfigurer {

    private static final String DEFAULT_THREAD_NAME_PREFIX = "Thread-liujie-";

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskExecutorConfig.class);

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
        return (ex, method, params) -> LOGGER.error("执行异步任务发生异常，方法：{}，参数：{}，具体的异常信息:{}"
                ,method.getName(), JSON.toJSONString(params),ex.getMessage());
    }
}
