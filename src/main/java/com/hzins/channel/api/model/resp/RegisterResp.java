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
 * 
 *
 *
 * </p>
 * @author	hz15041177 
 * @date	2015-5-20 上午9:42:21
 * @version      
 */
public class RegisterResp {
    
    private String transNo;
    
    private int partnerId;
    
    private String usreId;

    
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


    
    public String getUsreId() {
        return usreId;
    }

    
    public void setUsreId(String usreId) {
        this.usreId = usreId;
    }
    
    
}
 