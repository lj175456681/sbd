package com.liujie.dao.mapper;

import com.liujie.dao.po.BpFundBasicInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jie.liu
 * @since 2018-11-27
 */
public interface BpFundBasicInfoMapper extends BaseMapper<BpFundBasicInfo> {

    /**
     * 根据fundCode获取全部基金map key-fundCode,value-基金基本信息
     * @return
     */
    @MapKey("fundCode")
    Map<String,BpFundBasicInfo> selectFundMap();

}
