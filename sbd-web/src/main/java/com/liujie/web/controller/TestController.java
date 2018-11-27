package com.liujie.web.controller;


import com.liujie.dao.po.BpTaInfo;
import com.liujie.service.IBpTaInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/2 14:37
*/
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Resource
    private IBpTaInfoService bpTaInfoService;

    @RequestMapping(value = "queryBpTaInfo" ,method = RequestMethod.GET)
    public BpTaInfo getBpTaInfo(){
        BpTaInfo info = bpTaInfoService.getBpTaInfo("48");
        return info;
    }


    @RequestMapping(value = "updateTaInfo" ,method = RequestMethod.GET)
    public BpTaInfo updateBpTaInfo(){
        BpTaInfo info = bpTaInfoService.updateTaInfo("48");
        return info;
    }



}
