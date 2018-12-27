package com.liujie.dao.mapper;

import com.liujie.dao.DaoConfig;
import com.liujie.dao.po.AcMultiFundTxAcctRel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author : liujie
 * @Description:
 * @Date: 2018/12/17 14:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DaoConfig.class})
public class AcMultiFundTxAcctRelMapperTest {

    @Autowired
    private AcMultiFundTxAcctRelMapper acMultiFundTxAcctRelMapper;

    @Test
    public void insertTest(){
        AcMultiFundTxAcctRel rel = new AcMultiFundTxAcctRel();
        rel.setCustBankId("test");
        rel.setFundTxAcctNo("test");
        rel.setOutFundTxAcctNo("test");
        rel.setRelStat("0");
        rel.setTaCode("LJ");
        rel.setTradeDt("20181217");
        rel.setUpdateDt(LocalDateTime.now());
        rel.setCreateDt(LocalDateTime.now());
        acMultiFundTxAcctRelMapper.insert(rel);
    }

    @Test
    public void deleteTest(){
        int affect = acMultiFundTxAcctRelMapper.deleteById(61L);
        System.out.println(affect);
    }

}