package com.liujie.service.biz.impl;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liujie.dao.po.BpTaInfo;
import com.liujie.service.ServiceConfig;
import com.liujie.service.biz.IBpTaInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : liujie
 * @Description:
 * @Date: 2018/12/27 18:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ServiceConfig.class})
public class BpTaInfoServiceTest {

    @Autowired
    private IBpTaInfoService bpTaInfoService;

    @Test
    public void getBpTaInfo() {
        BpTaInfo bpTaInfo = bpTaInfoService.getBpTaInfo("02");
        System.out.println("######" + JSON.toJSONString(bpTaInfo));
    }

    @Test
    public void getBpTaInfoList() {
    }

    @Test
    public void updateTaInfo() {
        bpTaInfoService.updateTaInfo("02");
    }

    @Test
    public void queryByPage() {
        IPage<BpTaInfo> page = bpTaInfoService.queryByPage(2,1);
        System.out.println("#####" + JSON.toJSONString(page));
    }
}