package com.liujie.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jie.liu
 * @since 2018-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BP_FUND_BASIC_INFO")
public class BpFundBasicInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("FUND_CODE")
    private String fundCode;

    @TableField("FUND_NAME")
    private String fundName;

    @TableField("TA_CODE")
    private String taCode;

    @TableField("FUND_MAN_CODE")
    private String fundManCode;

    @TableField("CATEGORY_ID")
    private String categoryId;

    @TableField("CURRENCY")
    private String currency;

    @TableField("DFLT_DIV_MODE")
    private String dfltDivMode;

    @TableField("CHG_TRUSTEE_MODE")
    private String chgTrusteeMode;

    @TableField("START_TM")
    private String startTm;

    @TableField("END_TM")
    private String endTm;

    @TableField("SUPPLE_SUBS_RULE")
    private String suppleSubsRule;

    @TableField("FACE_VALUE")
    private Double faceValue;

    @TableField("FEE_CAL_MODE")
    private String feeCalMode;

    @TableField("MIN_ACCT_VOL")
    private Double minAcctVol;

    @TableField("FUND_RISK_LEVEL")
    private String fundRiskLevel;

    @TableField("REC_STAT")
    private String recStat;

    @TableField("CHECK_FLAG")
    private String checkFlag;

    @TableField("CREATOR")
    private String creator;

    @TableField("MODIFIER")
    private String modifier;

    @TableField("CHECKER")
    private String checker;

    @TableField("CRE_DT")
    private String creDt;

    @TableField("MOD_DT")
    private String modDt;

    @TableField("FUND_TYPE")
    private String fundType;

    @TableField("FUND_ATTR_PINYIN")
    private String fundAttrPinyin;

    @TableField("IPO_END_TM")
    private String ipoEndTm;

    @TableField("MAIN_FUND_CODE")
    private String mainFundCode;

    @TableField("DISTRIBUTE_SIZE")
    private Double distributeSize;

    @TableField("IPO_START_DT")
    private String ipoStartDt;

    @TableField("IPO_END_DT")
    private String ipoEndDt;

    @TableField("ESTABLISH_DT")
    private String establishDt;

    @TableField("FUND_CUSTODIAN_CODE")
    private String fundCustodianCode;

    @TableField("FUND_ATTR")
    private String fundAttr;

    @TableField("PART_CODE")
    private String partCode;

    @TableField("FUND_ATTR_HB")
    private String fundAttrHb;

    @TableField("FUND_SUB_TYPE")
    private String fundSubType;

    @TableField("REDE_OPEN_TERM")
    private String redeOpenTerm;

    @TableField("SUMMARY")
    private String summary;

    @TableField("FUND_OPEN_MODE")
    private String fundOpenMode;

    @TableField("YIELD_TYPE")
    private String yieldType;

    @TableField("RECOMM_INFO")
    private String recommInfo;

    @TableField("FUND_STAT_PRESET_DAYS")
    private Integer fundStatPresetDays;

    @TableField("SETTLE_TYPE")
    private String settleType;

    @TableField("OPEN_DT")
    private String openDt;

    @TableField("OPEN_FLAG")
    private String openFlag;

    @TableField("FUND_CLASS")
    private String fundClass;

    @TableField("DIV_GROUP_CODE")
    private String divGroupCode;

    @TableField("INDEX_FUSE_TYPE")
    private String indexFuseType;

    @TableField("EXPECTED_ANNUAL_YIELD")
    private Double expectedAnnualYield;

    @TableField("EXPECTED_ANNUAL_DAYS")
    private Integer expectedAnnualDays;

    @TableField("PROD_ROLL_RANGE")
    private Integer prodRollRange;

    @TableField("PROD_SUB_DAYS")
    private Integer prodSubDays;

    @TableField("PROD_REDM_DAYS")
    private Integer prodRedmDays;

    @TableField("HOLIDAY_STRATEGY")
    private String holidayStrategy;

    @TableField("PROD_DIFFER")
    private Integer prodDiffer;

    @TableField("OPEN_DAY_START_TYPE")
    private String openDayStartType;

    /**
     * 全赎是否带出未付收益 1-是；0-否
     */
    @TableField("REDE_UNPAID_EARN")
    private String redeUnpaidEarn;

    /**
     * 是否有份额锁定期 0-否；1-是
     */
    @TableField("HAS_LOCK_PERIOD")
    private String hasLockPeriod;

    /**
     * 是否同步TA参数 0-否；1-是
     */
    @TableField("IS_SYNC_TA_PARAM")
    private String isSyncTaParam;

    /**
     * 认购期是否每日上报 0-否；1-是
     */
    @TableField("IS_REPORTED_EVERYDAY")
    private String isReportedEveryday;

    /**
     * TA基金代码
     */
    @TableField("TA_FUND_CODE")
    private String taFundCode;

    /**
     * 协会基金代码
     */
    @TableField("ASOC_FUND_CODE")
    private String asocFundCode;

    /**
     * 是否是母基金 0-否；1-是
     */
    @TableField("IS_MOTHER_FUND")
    private String isMotherFund;

    /**
     * 巨额赎回比例
     */
    @TableField("HUGE_REDEEM_RATIO")
    private Double hugeRedeemRatio;

    /**
     * 净值精度
     */
    @TableField("NAV_PRECISION")
    private Integer navPrecision;

    /**
     * 基金结束日期
     */
    @TableField("FUND_END_DT")
    private String fundEndDt;

    /**
     * 最低保留资产
     */
    @TableField("MIN_RETAINED_ASSET")
    private Double minRetainedAsset;

    /**
     * 份额锁定控制类型 1-日；2-周；3-月；4-年
     */
    @TableField("LOCK_PERIOD_TYPE")
    private String lockPeriodType;

    /**
     * 份锁定额控制数
     */
    @TableField("LOCK_AMOUNT")
    private Integer lockAmount;

    /**
     * 锁定方式 0-按交易确认日1-按交易申请日
     */
    @TableField("LOCK_MODE")
    private String lockMode;

    /**
     * 是否循环锁定 0-否，1-是
     */
    @TableField("IS_CYCLIC_LOCK")
    private String isCyclicLock;

    /**
     * 是否是结构型基金 0-否；1-是
     */
    @TableField("IS_STRUCTURAL_FUND")
    private String isStructuralFund;

    /**
     * 份额精度
     */
    @TableField("VOL_PRECISION")
    private Integer volPrecision;

    /**
     * 资金匹配条件
     */
    @TableField("MATCH_CONDITION")
    private String matchCondition;

    /**
     * 支持预约 0-非预约 1-仅购买预约 2-仅赎回预约 3-购买赎回预约
     */
    @TableField("IS_SCHEDULED_TRADE")
    private String isScheduledTrade;


}
