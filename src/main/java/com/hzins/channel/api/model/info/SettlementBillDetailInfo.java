/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.channel.api.model.info; 


/**
 * <p>
 * 申请结算明细信息
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午7:06:25
 * @version      
 */
public class SettlementBillDetailInfo {
    
    //申请服务费结算之后的settlementBill数据的Id
    private int billId;
    
    //结算年份
    private int year;
    
    //结算月度
    private int month;
    
    //结算周期
    private String range;
    
    //申请结算时间
    private String createTime;
    
    //用户类型(0表示渠道，1表示代理商)
    private int userType;
    
    //应付收入(税前)
    private double applyFee;
    
    //代扣税款
    private double deductTax;
    
    //应付收入(税后)
    private double payFee;
    
    //结算状态(0未结算，1表示已结算)
    private int state;

    
    public int getYear() {
        return year;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    
    public int getMonth() {
        return month;
    }

    
    public void setMonth(int month) {
        this.month = month;
    }

    
    public String getRange() {
        return range;
    }

    
    public void setRange(String range) {
        this.range = range;
    }



    
    public String getCreateTime() {
        return createTime;
    }


    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }



    
    
    public double getApplyFee() {
        return applyFee;
    }


    
    public void setApplyFee(double applyFee) {
        this.applyFee = applyFee;
    }


    
    public double getDeductTax() {
        return deductTax;
    }


    
    public void setDeductTax(double deductTax) {
        this.deductTax = deductTax;
    }


    
    public double getPayFee() {
        return payFee;
    }


    
    public void setPayFee(double payFee) {
        this.payFee = payFee;
    }


    public int getUserType() {
        return userType;
    }


    
    public void setUserType(int userType) {
        this.userType = userType;
    }


    
    public int getState() {
        return state;
    }


    
    public void setState(int state) {
        this.state = state;
    }


    
    public int getBillId() {
        return billId;
    }


    
    public void setBillId(int billId) {
        this.billId = billId;
    }

} 