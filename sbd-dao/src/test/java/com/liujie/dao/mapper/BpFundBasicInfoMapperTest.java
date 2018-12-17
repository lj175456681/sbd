package com.liujie.dao.mapper;

import com.liujie.dao.DaoConfig;
import com.liujie.dao.po.BpFundBasicInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;


/**
 * @author : liujie
 * @Description:
 * @Date: 2018/11/29 14:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DaoConfig.class})
public class BpFundBasicInfoMapperTest {

    @Autowired
    private BpFundBasicInfoMapper bpFundBasicInfoMapper;

    @Test
    public void selectFundMap() {
        Map<String,BpFundBasicInfo> map = bpFundBasicInfoMapper.selectFundMap();
        System.out.println(map);
    }
}