package com.liujie.service.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/7/19 16:02
*/
@Component
@ConfigurationProperties(prefix = "spring.task.pool")
@Data
public class TaskExecutorProperties {

    private int corePoolSize;

    private int maxPoolSize;

    private int queueCapacity;

    private int keepAliveSeconds;

    private boolean allowCoreThreadTimeOut;
}
