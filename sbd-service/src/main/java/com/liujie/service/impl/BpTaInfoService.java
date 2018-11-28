package com.liujie.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Maps;
import com.liujie.dao.mapper.BpTaInfoMapper;
import com.liujie.dao.po.BpTaInfo;
import com.liujie.service.IBpTaInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/2 14:36
*/
@Slf4j
@Service
public class BpTaInfoService implements IBpTaInfoService{

    @Resource
    private BpTaInfoMapper bpTaInfoMapper;

    @Override
    public BpTaInfo getBpTaInfo(String code) {
        return bpTaInfoMapper.selectById(code);
    }

    @Override
    public Page<BpTaInfo> getBpTaInfoList() {
        return null;
    }

    @Override
    @Transactional
    public BpTaInfo updateTaInfo(String taCode) {
        BpTaInfo taInfo = getBpTaInfo(taCode);
        bpTaInfoMapper.updateById(taInfo);
        return getBpTaInfo(taCode);
    }

    @Override
    public IPage<BpTaInfo> queryByPage(int pageSize, int pageNo) {
        Page<BpTaInfo> page = new Page(pageNo,pageSize);
        QueryWrapper<BpTaInfo> wrapper = new QueryWrapper();
        Map<String,String> param = Maps.newHashMap();
        param.put("recStat","0");
        param.put("checkFlag","1");
        wrapper.allEq(param);
        wrapper.orderByAsc("taCode");
        IPage<BpTaInfo> result =  bpTaInfoMapper.selectPage(page,wrapper);
        return result;
    }
}
