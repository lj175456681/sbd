package com.liujie.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
 * @since 2018-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("AC_MULTI_FUND_TX_ACCT_REL")
@KeySequence("SEQ_AC_MULTI_FUND_TX_ACCT_REL")
public class AcMultiFundTxAcctRel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SID",type = IdType.INPUT)
    private Long sid;

    /**
     * 好买基金交易账号
     */
    @TableField("FUND_TX_ACCT_NO")
    private String fundTxAcctNo;

    /**
     * 上报TA的基金交易账号
     */
    @TableField("OUT_FUND_TX_ACCT_NO")
    private String outFundTxAcctNo;

    /**
     * 银行卡ID
     */
    @TableField("CUST_BANK_ID")
    private String custBankId;

    /**
     * TA代码
     */
    @TableField("TA_CODE")
    private String taCode;

    /**
     * 交易日
     */
    @TableField("TRADE_DT")
    private String tradeDt;

    /**
     * 状态 0-正常，3-注销，5-开户待确认，6-销户待确认，7-失败
     */
    @TableField("REL_STAT")
    private String relStat;

    /**
     * 创建日期
     */
    @TableField("CREATE_DT")
    private LocalDateTime createDt;

    /**
     * 修改日期
     */
    @TableField("UPDATE_DT")
    private LocalDateTime updateDt;


}
