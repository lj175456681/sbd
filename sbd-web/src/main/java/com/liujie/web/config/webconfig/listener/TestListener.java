package com.liujie.web.config.webconfig.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener(value = "testListener")
public class TestListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(TestListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("初始化testListener。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("销毁testListener。。。");
    }
}
