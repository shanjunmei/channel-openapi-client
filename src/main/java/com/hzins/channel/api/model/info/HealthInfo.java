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
 * 寿险健康险专用实体（旅意险不考虑）
 * </p>
 *  
 * @author	hz15041177 
 * @date	2015-11-5 下午5:57:15
 * @version
 */
public class HealthInfo {
    
    /*************************************/
    //保单密码
    private String insurePassword;
    
    // 持卡人卡号
    private String backPayAccount ;
    
    // 持卡人姓名
    private String backPayName;
    
    // 赎回银行ID
    private int backPayBank;
    
    // 赎回银行名称
    private String backPayBankName;
    
    // 年收入
    private double insuredYearlyIncome;
    /*************************************/
    
    //续期缴费银行
    private int renewalPayBank;
    
    //续期缴费银行名称
    private String renewalPayBankName;
    
    //续期缴费户名
    private String renewalPayName;
    
    //续期缴费账号
    private String renewalPayAccount;
    
    //健康告知ID
    private int notifyAnswerId;

    
    public String getInsurePassword() {
        return insurePassword;
    }

    
    public void setInsurePassword(String insurePassword) {
        this.insurePassword = insurePassword;
    }

    
    public String getBackPayAccount() {
        return backPayAccount;
    }

    
    public void setBackPayAccount(String backPayAccount) {
        this.backPayAccount = backPayAccount;
    }

    
    public String getBackPayName() {
        return backPayName;
    }

    
    public void setBackPayName(String backPayName) {
        this.backPayName = backPayName;
    }

    
    public int getBackPayBank() {
        return backPayBank;
    }

    
    public void setBackPayBank(int backPayBank) {
        this.backPayBank = backPayBank;
    }

    
    public String getBackPayBankName() {
        return backPayBankName;
    }

    
    public void setBackPayBankName(String backPayBankName) {
        this.backPayBankName = backPayBankName;
    }

    
    public double getInsuredYearlyIncome() {
        return insuredYearlyIncome;
    }

    
    public void setInsuredYearlyIncome(double insuredYearlyIncome) {
        this.insuredYearlyIncome = insuredYearlyIncome;
    }

    
    public int getRenewalPayBank() {
        return renewalPayBank;
    }

    
    public void setRenewalPayBank(int renewalPayBank) {
        this.renewalPayBank = renewalPayBank;
    }

    
    public String getRenewalPayBankName() {
        return renewalPayBankName;
    }

    
    public void setRenewalPayBankName(String renewalPayBankName) {
        this.renewalPayBankName = renewalPayBankName;
    }

    
    public String getRenewalPayName() {
        return renewalPayName;
    }

    
    public void setRenewalPayName(String renewalPayName) {
        this.renewalPayName = renewalPayName;
    }

    
    public String getRenewalPayAccount() {
        return renewalPayAccount;
    }

    
    public void setRenewalPayAccount(String renewalPayAccount) {
        this.renewalPayAccount = renewalPayAccount;
    }

    
    public int getNotifyAnswerId() {
        return notifyAnswerId;
    }

    
    public void setNotifyAnswerId(int notifyAnswerId) {
        this.notifyAnswerId = notifyAnswerId;
    }
    

    
   
    
}
 