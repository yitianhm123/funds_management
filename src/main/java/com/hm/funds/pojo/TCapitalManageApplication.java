package com.hm.funds.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCapitalManageApplication implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.FUNDSBACK_APPLY_NO
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String fundsbackApplyNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.SUPLR_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String suplrName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.CUST_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String custName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.FUNDSBACK_TYPE
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String fundsbackType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.FUNDSBACK_AMOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private BigDecimal fundsbackAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.APPLYFUNDS_AMOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private BigDecimal applyfundsAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.APPLY_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String applyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.STATUS
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.PAYBACK_MARK
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String paybackMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.TO_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String toAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.BANK_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String bankAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.BANK_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String bankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.LATESTPAY_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private Date latestpayTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.REMARK
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.CREATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.CREATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.UPDATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private String updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_manage_application.DELETED
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private Integer deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_capital_manage_application
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.ID
     *
     * @return the value of t_capital_manage_application.ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.ID
     *
     * @param id the value for t_capital_manage_application.ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.FUNDSBACK_APPLY_NO
     *
     * @return the value of t_capital_manage_application.FUNDSBACK_APPLY_NO
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getFundsbackApplyNo() {
        return fundsbackApplyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.FUNDSBACK_APPLY_NO
     *
     * @param fundsbackApplyNo the value for t_capital_manage_application.FUNDSBACK_APPLY_NO
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setFundsbackApplyNo(String fundsbackApplyNo) {
        this.fundsbackApplyNo = fundsbackApplyNo == null ? null : fundsbackApplyNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.SUPLR_NAME
     *
     * @return the value of t_capital_manage_application.SUPLR_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getSuplrName() {
        return suplrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.SUPLR_NAME
     *
     * @param suplrName the value for t_capital_manage_application.SUPLR_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setSuplrName(String suplrName) {
        this.suplrName = suplrName == null ? null : suplrName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.CUST_NAME
     *
     * @return the value of t_capital_manage_application.CUST_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.CUST_NAME
     *
     * @param custName the value for t_capital_manage_application.CUST_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.FUNDSBACK_TYPE
     *
     * @return the value of t_capital_manage_application.FUNDSBACK_TYPE
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getFundsbackType() {
        return fundsbackType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.FUNDSBACK_TYPE
     *
     * @param fundsbackType the value for t_capital_manage_application.FUNDSBACK_TYPE
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setFundsbackType(String fundsbackType) {
        this.fundsbackType = fundsbackType == null ? null : fundsbackType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.FUNDSBACK_AMOUNT
     *
     * @return the value of t_capital_manage_application.FUNDSBACK_AMOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public BigDecimal getFundsbackAmount() {
        return fundsbackAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.FUNDSBACK_AMOUNT
     *
     * @param fundsbackAmount the value for t_capital_manage_application.FUNDSBACK_AMOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setFundsbackAmount(BigDecimal fundsbackAmount) {
        this.fundsbackAmount = fundsbackAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.APPLYFUNDS_AMOUNT
     *
     * @return the value of t_capital_manage_application.APPLYFUNDS_AMOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public BigDecimal getApplyfundsAmount() {
        return applyfundsAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.APPLYFUNDS_AMOUNT
     *
     * @param applyfundsAmount the value for t_capital_manage_application.APPLYFUNDS_AMOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setApplyfundsAmount(BigDecimal applyfundsAmount) {
        this.applyfundsAmount = applyfundsAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.APPLY_TIME
     *
     * @return the value of t_capital_manage_application.APPLY_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.APPLY_TIME
     *
     * @param applyTime the value for t_capital_manage_application.APPLY_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.STATUS
     *
     * @return the value of t_capital_manage_application.STATUS
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.STATUS
     *
     * @param status the value for t_capital_manage_application.STATUS
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.PAYBACK_MARK
     *
     * @return the value of t_capital_manage_application.PAYBACK_MARK
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getPaybackMark() {
        return paybackMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.PAYBACK_MARK
     *
     * @param paybackMark the value for t_capital_manage_application.PAYBACK_MARK
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setPaybackMark(String paybackMark) {
        this.paybackMark = paybackMark == null ? null : paybackMark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.TO_ACCOUNT
     *
     * @return the value of t_capital_manage_application.TO_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getToAccount() {
        return toAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.TO_ACCOUNT
     *
     * @param toAccount the value for t_capital_manage_application.TO_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount == null ? null : toAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.BANK_ACCOUNT
     *
     * @return the value of t_capital_manage_application.BANK_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.BANK_ACCOUNT
     *
     * @param bankAccount the value for t_capital_manage_application.BANK_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.BANK_NAME
     *
     * @return the value of t_capital_manage_application.BANK_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.BANK_NAME
     *
     * @param bankName the value for t_capital_manage_application.BANK_NAME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.LATESTPAY_TIME
     *
     * @return the value of t_capital_manage_application.LATESTPAY_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public Date getLatestpayTime() {
        return latestpayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.LATESTPAY_TIME
     *
     * @param latestpayTime the value for t_capital_manage_application.LATESTPAY_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setLatestpayTime(Date latestpayTime) {
        this.latestpayTime = latestpayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.REMARK
     *
     * @return the value of t_capital_manage_application.REMARK
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.REMARK
     *
     * @param remark the value for t_capital_manage_application.REMARK
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.CREATE_USER_ID
     *
     * @return the value of t_capital_manage_application.CREATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.CREATE_USER_ID
     *
     * @param createUserId the value for t_capital_manage_application.CREATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.CREATE_TIME
     *
     * @return the value of t_capital_manage_application.CREATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.CREATE_TIME
     *
     * @param createTime the value for t_capital_manage_application.CREATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.UPDATE_USER_ID
     *
     * @return the value of t_capital_manage_application.UPDATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.UPDATE_USER_ID
     *
     * @param updateUserId the value for t_capital_manage_application.UPDATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.UPDATE_TIME
     *
     * @return the value of t_capital_manage_application.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.UPDATE_TIME
     *
     * @param updateTime the value for t_capital_manage_application.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_manage_application.DELETED
     *
     * @return the value of t_capital_manage_application.DELETED
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_manage_application.DELETED
     *
     * @param deleted the value for t_capital_manage_application.DELETED
     *
     * @mbggenerated Fri Nov 17 17:07:21 CST 2017
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}