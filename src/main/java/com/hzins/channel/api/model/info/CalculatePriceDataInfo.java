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
 * 寿险健康险需加入的试算实体类
 * </p>
 * @author	hz15041177 
 * @date	2015-11-7 下午7:58:39
 * @version      
 */
public class CalculatePriceDataInfo {
    

    //保证项目选项值(暂时不传)
    private String optionValue;
    
    
    //缴费期限 一次性缴或者趸交 传0
    private int paymentLimit;
    
    //保障期限
    private int insurancePeriod;
    
    //保障期限单位 1为年 2为岁
    private int insuranceUnit ;
    
    //保险金额
    private double insuranceAmount;

    

    
    public String getOptionValue() {
        return optionValue;
    }

    
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    
    public int getPaymentLimit() {
        return paymentLimit;
    }

    
    public void setPaymentLimit(int paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    
    public int getInsurancePeriod() {
        return insurancePeriod;
    }

    
    public void setInsurancePeriod(int insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
    }

    
    public int getInsuranceUnit() {
        return insuranceUnit;
    }

    
    public void setInsuranceUnit(int insuranceUnit) {
        this.insuranceUnit = insuranceUnit;
    }

    
    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    
    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }
    
    

}
 