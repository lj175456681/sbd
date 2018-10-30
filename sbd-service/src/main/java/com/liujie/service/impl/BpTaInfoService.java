package com.liujie.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liujie.dao.mapper.BpTaInfoMapper;
import com.liujie.dao.po.BpTaInfo;
import com.liujie.service.IBpTaInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

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
        log.error("在加了@Slfj4注解以后，并且安装了lombok，可以直接使用log日志");
        BpTaInfo taInfo = getBpTaInfo(taCode);
        taInfo.setChecker("liujie");
        bpTaInfoMapper.updateById(taInfo);
        return getBpTaInfo(taCode);
    }
}
