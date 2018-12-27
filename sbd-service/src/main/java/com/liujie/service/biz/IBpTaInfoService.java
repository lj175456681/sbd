package com.liujie.service.biz;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liujie.dao.po.BpTaInfo;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/2 14:35
*/
public interface IBpTaInfoService {


    BpTaInfo getBpTaInfo(String code);

    Page<BpTaInfo> getBpTaInfoList();

    BpTaInfo updateTaInfo(String taCode);

    IPage<BpTaInfo> queryByPage(int pageSize, int pageNo);
}
