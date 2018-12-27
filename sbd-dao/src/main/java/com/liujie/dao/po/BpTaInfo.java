package com.liujie.dao.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * TA信息表
 * </p>
 *
 * @author jie.liu
 * @since 2018-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BP_TA_INFO")
public class BpTaInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * TA代码
     */
    @TableId("TA_CODE")
    private String taCode;

    /**
     * TA名称
     */
    @TableField("TA_NAME")
    private String taName;

    /**
     * TA简称
     */
    @TableField("TA_ABBR")
    private String taAbbr;

    /**
     * TA状态
0-正常；1-关闭；2-暂停
     */
    @TableField("TA_STAT")
    private String taStat;

    /**
     * 上送TA客户资料类别编号
     */
    @TableField("CUST_INFO_TYPE_ID")
    private String custInfoTypeId;

    /**
     * 记录状态 0-正常
     */
    @TableField("REC_STAT")
    private String recStat;

    /**
     * 复核标志 0-未复核；1-已复核
     */
    @TableField("CHECK_FLAG")
    private String checkFlag;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 复核人
     */
    @TableField("CHECKER")
    private String checker;

    /**
     * 修改人
     */
    @TableField("MODIFIER")
    private String modifier;

    /**
     * 记录创建日期
     */
    @TableField("CRE_DT")
    private String creDt;

    /**
     * 记录修改日期
     */
    @TableField("MOD_DT")
    private String modDt;

    /**
     * 差额交收标志（0-全额交收；1-差额交收）
     */
    @TableField("MARGIN_PMT_FLAG")
    private String marginPmtFlag;

    /**
     * 结算人代码
     */
    @TableField("PART_CODE")
    private String partCode;

    /**
     * 默认05文件对账方式（1-全量；2-增量）
     */
    @TableField("DFLT_CHK_MODE_05")
    private String dfltChkMode05;

    /**
     * 默认26文件对账方式（1-全量；2-增量）
     */
    @TableField("DFLT_CHK_MODE_26")
    private String dfltChkMode26;

    /**
     * 26文件处理标志（1-不处理；2-处理但不显示；3-处理且显示）
     */
    @TableField("BAL_DTL_26_DEAL_FLAG")
    private String balDtl26DealFlag;

    /**
     * 接口类型 1-中登标准接口,2-元年,3-国泰,4-招商,5-国金道富,6-中信证券,7-CORTLAND
     */
    @TableField("INTERFACE_TYPE")
    private String interfaceType;

    /**
     * 支持卡类别 1-多卡、2-产品单卡、3-TA单卡
     */
    @TableField("SUPPORT_CARD_TYPE")
    private String supportCardType;

    /**
     * 监管定义公司代码
     */
    @TableField("DEFINED_COMPANY_CODE")
    private String definedCompanyCode;

    /**
     * 是否支持多交易账号 0-否，1-是
     */
    @TableField("IS_MULTI_TRADE_ACCT")
    private String isMultiTradeAcct;

    /**
     * 0-直销，1-代销
     */
    @TableField("SALE_TYPE")
    private String saleType;


}
