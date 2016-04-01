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
 * 返回基础类
 * </p>
 * @author	hz15031081 
 * @date	2015-4-2 下午5:10:35
 * @version      
 */
public abstract class BaseResp {
    
    // 交易流水号，每一单请求交易不能相同
    private String transNo;
    
    // 代理商编号
    private int partnerId; 
    
    
    
    
    
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

    
    

}
 