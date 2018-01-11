package com.hm.funds.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCapitalAccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.COM_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String comId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.COM_TYPE
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String comType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.COM_NAME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String comName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.CASH_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal cashAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.USABLE_CASH
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal usableCash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.ORDER_CASH
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal orderCash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.BILL_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal billAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.USABLE_BILL
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal usableBill;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.ORDER_BILL
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal orderBill;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.REBATE_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private BigDecimal rebateAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.REMARK
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.CREATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.CREATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.UPDATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private String updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_capital_account.DELETED
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_capital_account
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.ID
     *
     * @return the value of t_capital_account.ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.ID
     *
     * @param id the value for t_capital_account.ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.COM_ID
     *
     * @return the value of t_capital_account.COM_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getComId() {
        return comId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.COM_ID
     *
     * @param comId the value for t_capital_account.COM_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setComId(String comId) {
        this.comId = comId == null ? null : comId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.COM_TYPE
     *
     * @return the value of t_capital_account.COM_TYPE
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getComType() {
        return comType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.COM_TYPE
     *
     * @param comType the value for t_capital_account.COM_TYPE
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setComType(String comType) {
        this.comType = comType == null ? null : comType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.COM_NAME
     *
     * @return the value of t_capital_account.COM_NAME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getComName() {
        return comName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.COM_NAME
     *
     * @param comName the value for t_capital_account.COM_NAME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.CASH_ACCOUNT
     *
     * @return the value of t_capital_account.CASH_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getCashAccount() {
        return cashAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.CASH_ACCOUNT
     *
     * @param cashAccount the value for t_capital_account.CASH_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setCashAccount(BigDecimal cashAccount) {
        this.cashAccount = cashAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.USABLE_CASH
     *
     * @return the value of t_capital_account.USABLE_CASH
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getUsableCash() {
        return usableCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.USABLE_CASH
     *
     * @param usableCash the value for t_capital_account.USABLE_CASH
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setUsableCash(BigDecimal usableCash) {
        this.usableCash = usableCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.ORDER_CASH
     *
     * @return the value of t_capital_account.ORDER_CASH
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getOrderCash() {
        return orderCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.ORDER_CASH
     *
     * @param orderCash the value for t_capital_account.ORDER_CASH
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setOrderCash(BigDecimal orderCash) {
        this.orderCash = orderCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.BILL_ACCOUNT
     *
     * @return the value of t_capital_account.BILL_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getBillAccount() {
        return billAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.BILL_ACCOUNT
     *
     * @param billAccount the value for t_capital_account.BILL_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setBillAccount(BigDecimal billAccount) {
        this.billAccount = billAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.USABLE_BILL
     *
     * @return the value of t_capital_account.USABLE_BILL
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getUsableBill() {
        return usableBill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.USABLE_BILL
     *
     * @param usableBill the value for t_capital_account.USABLE_BILL
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setUsableBill(BigDecimal usableBill) {
        this.usableBill = usableBill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.ORDER_BILL
     *
     * @return the value of t_capital_account.ORDER_BILL
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getOrderBill() {
        return orderBill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.ORDER_BILL
     *
     * @param orderBill the value for t_capital_account.ORDER_BILL
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setOrderBill(BigDecimal orderBill) {
        this.orderBill = orderBill;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.REBATE_ACCOUNT
     *
     * @return the value of t_capital_account.REBATE_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public BigDecimal getRebateAccount() {
        return rebateAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.REBATE_ACCOUNT
     *
     * @param rebateAccount the value for t_capital_account.REBATE_ACCOUNT
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setRebateAccount(BigDecimal rebateAccount) {
        this.rebateAccount = rebateAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.REMARK
     *
     * @return the value of t_capital_account.REMARK
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.REMARK
     *
     * @param remark the value for t_capital_account.REMARK
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.CREATE_USER_ID
     *
     * @return the value of t_capital_account.CREATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.CREATE_USER_ID
     *
     * @param createUserId the value for t_capital_account.CREATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.CREATE_TIME
     *
     * @return the value of t_capital_account.CREATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.CREATE_TIME
     *
     * @param createTime the value for t_capital_account.CREATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.UPDATE_USER_ID
     *
     * @return the value of t_capital_account.UPDATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.UPDATE_USER_ID
     *
     * @param updateUserId the value for t_capital_account.UPDATE_USER_ID
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.UPDATE_TIME
     *
     * @return the value of t_capital_account.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.UPDATE_TIME
     *
     * @param updateTime the value for t_capital_account.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_capital_account.DELETED
     *
     * @return the value of t_capital_account.DELETED
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_capital_account.DELETED
     *
     * @param deleted the value for t_capital_account.DELETED
     *
     * @mbggenerated Fri Nov 17 17:02:37 CST 2017
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}