package com.liujie.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liujie.dao.DaoConfig;
import com.liujie.dao.po.BpFundBasicInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
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


    @Test
    public void queryTest(){
        QueryWrapper<BpFundBasicInfo> queryWarpper = new QueryWrapper<>();
        queryWarpper.eq("fund_type","11");
        List<BpFundBasicInfo> list = bpFundBasicInfoMapper.selectList(queryWarpper);
        System.out.println(list);
    }

    @Test
    public void queryByPage(){
        Page<BpFundBasicInfo> page = new Page<>(1,5);
        QueryWrapper<BpFundBasicInfo> queryWarpper = new QueryWrapper<>();
        queryWarpper.eq("fund_type","11");
        IPage<BpFundBasicInfo> result = bpFundBasicInfoMapper.selectPage(page,queryWarpper);
        System.out.println(result.getTotal() + "," + result.getPages() + "," + result.getRecords());
    }
}