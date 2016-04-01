/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.channel.api.model.resp; 


/**
 * <p>
 * 结算申请返回
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午7:12:25
 * @version      
 */
public class SettlementBillTotalResp {

    private String transNo;
    
    private int partnerId;
    
    //已结算
    private double payed;
    
    //未结算
    private double unPayed ;
    
    //当前可结算(不会根据时间条件查询)
    private double allowPayed ;

    
    public String getTransNo() {
        return transNo;
    }

    
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    
    public int getPartnerId() {
        return partnerId;
    }

    
    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    
    public double getPayed() {
        return payed;
    }

    
    public void setPayed(double payed) {
        this.payed = payed;
    }

    
    public double getUnPayed() {
        return unPayed;
    }

    
    public void setUnPayed(double unPayed) {
        this.unPayed = unPayed;
    }

    
    public double getAllowPayed() {
        return allowPayed;
    }

    
    public void setAllowPayed(double allowPayed) {
        this.allowPayed = allowPayed;
    }


    
}
 