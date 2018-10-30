package com.liujie.dao;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/10/30 11:20
*/
public class CodeGenerator {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir") + "src/main/java");
        gc.setAuthor("liujie");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);
        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:oracle:thin:@192.168.220.126:1521:hbqa11g");
        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        dsc.setUsername("SIT_XM84_TRADE");
        dsc.setPassword("howbuy2015");
        dsc.setSchemaName("SIT_XM84_TRADE");
        mpg.setDataSource(dsc);
        //


    }
}
