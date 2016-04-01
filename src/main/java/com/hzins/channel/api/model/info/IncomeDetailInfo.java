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
 * 服务费按月汇总详细信息
 * </p>
 * @author	hz15031081 
 * @date	2015-4-2 下午5:51:54
 * @version      
 */
public class IncomeDetailInfo {
    


    //0为未结算，1为结算中，2为已经结算
    private int settlementState;

    private Integer month;

    private String userId;

    private Integer year;

    //总计服务费(Income+Award)
    private double totalIncome; 
    //总计保费
    private double premium;
    
    

    
    public int getSettlementState() {
        return settlementState;
    }

    
    public void setSettlementState(int settlementState) {
        this.settlementState = settlementState;
    }

    public Integer getMonth() {
        return month;
    }
    
    public void setMonth(Integer month) {
        this.month = month;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public Integer getYear() {
        return year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }


    
    public double getTotalIncome() {
        return totalIncome;
    }


    
    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }


    
    public double getPremium() {
        return premium;
    }


    
    public void setPremium(double premium) {
        this.premium = premium;
    }
    

}
 