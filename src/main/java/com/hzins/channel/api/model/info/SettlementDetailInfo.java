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
 *服务费明细信息
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午3:49:50
 * @version      
 */
public class SettlementDetailInfo {

    private String email;
    
    private String payDateTime;
    
    private String insureNum;
    
    private String productName;
    
    private double originalPrice;
    
    private double price;
    
    private double income;

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }


    public String getInsureNum() {
        return insureNum;
    }

    
    public void setInsureNum(String insureNum) {
        this.insureNum = insureNum;
    }

    
    public String getProductName() {
        return productName;
    }

    
    public void setProductName(String productName) {
        this.productName = productName;
    }


    
    
    public double getOriginalPrice() {
        return originalPrice;
    }


    
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }


    
    public double getPrice() {
        return price;
    }


    
    public void setPrice(double price) {
        this.price = price;
    }


    
    public double getIncome() {
        return income;
    }


    
    public void setIncome(double income) {
        this.income = income;
    }


    public String getPayDateTime() {
        return payDateTime;
    }


    
    public void setPayDateTime(String payDateTime) {
        this.payDateTime = payDateTime;
    }
    
}
 