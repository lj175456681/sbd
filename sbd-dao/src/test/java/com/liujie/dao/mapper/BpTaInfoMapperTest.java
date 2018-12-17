package com.liujie.dao.mapper;

import com.liujie.dao.DaoConfig;
import com.liujie.dao.po.BpTaInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;


/**
 * @author : liujie
 * @Description:
 * @Date: 2018/12/17 11:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DaoConfig.class})
public class BpTaInfoMapperTest {

    @Autowired
    private BpTaInfoMapper taInfoMapper;


    @Test
    public void queryTest(){
        BpTaInfo taInfo = taInfoMapper.selectById("JA");
        System.out.println(taInfo);
    }

}