package com.liujie.dao;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/10/29 20:58
*/
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.liujie.dao.mapper")
public class DaoConfig {
}
