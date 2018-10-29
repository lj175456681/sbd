package com.liujie.dao.mapper;


import com.liujie.dao.po.BpTaInfo;

import java.util.List;

public interface BpTaInfoMapper{
    int deleteByPrimaryKey(String taCode);

    int insert(BpTaInfo record);

    int insertSelective(BpTaInfo record);

    BpTaInfo selectByPrimaryKey(String taCode);

    int updateByPrimaryKeySelective(BpTaInfo record);

    int updateByPrimaryKey(BpTaInfo record);

    List<BpTaInfo> selectTas();
}