package com.liujie.service;


import com.liujie.dao.DaoConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/7/19 15:20
*/
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableTransactionManagement
@Import(DaoConfig.class)
public class ServiceConfig {
}
