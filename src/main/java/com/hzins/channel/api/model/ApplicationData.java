/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.channel.api.model; 


/**
 * <p>
 * 
 * </p>
 * @author	hz15031081 
 * @date	2015-4-2 下午5:43:13
 * @version      
 */
public class ApplicationData {
    
    // 投保时间
    private String applicationDate;
    
    // 起保日期，保单的生效时间
    private String startDate;
    
    // 终保日期，保单的失效时间
    private String endDate;
    
    // 结算价，即相应保险产品的保费
    private double singlePrice;

    
    public String getApplicationDate() {
        return applicationDate;
    }

    
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
        
    public String getStartDate() {
        return startDate;
    }
   
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    public String getEndDate() {
        return endDate;
    }


    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    public double getSinglePrice() {
        return singlePrice;
    }

    
    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

}
 