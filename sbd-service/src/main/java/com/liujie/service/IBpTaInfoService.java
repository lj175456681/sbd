package com.liujie.service;


import com.github.pagehelper.PageInfo;
import com.liujie.dao.po.BpTaInfo;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/2 14:35
*/
public interface IBpTaInfoService {


    BpTaInfo getBpTaInfo(String code);

    PageInfo<BpTaInfo> getBpTaInfoList();

    BpTaInfo updateTaInfo(String taCode);
}
