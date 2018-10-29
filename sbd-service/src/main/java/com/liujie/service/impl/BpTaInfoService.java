package com.liujie.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liujie.dao.mapper.BpTaInfoMapper;
import com.liujie.dao.po.BpTaInfo;
import com.liujie.service.IBpTaInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/2 14:36
*/
@Service
public class BpTaInfoService implements IBpTaInfoService{

    @Resource
    private BpTaInfoMapper bpTaInfoMapper;

    @Override
    public BpTaInfo getBpTaInfo(String code) {
        return bpTaInfoMapper.selectByPrimaryKey(code);
    }

    @Override
    public PageInfo<BpTaInfo> getBpTaInfoList() {
        PageHelper.startPage(1,5);
        List<BpTaInfo> list = bpTaInfoMapper.selectTas();
        return new PageInfo<>(list);
    }

    @Override
    @Transactional
    public BpTaInfo updateTaInfo(String taCode) {
        BpTaInfo taInfo = getBpTaInfo(taCode);
        taInfo.setChecker("liujie");
        bpTaInfoMapper.updateByPrimaryKeySelective(taInfo);
        return getBpTaInfo(taCode);
    }
}
