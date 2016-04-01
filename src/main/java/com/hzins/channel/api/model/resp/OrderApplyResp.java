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

import java.util.List;

import com.hzins.channel.api.model.info.OrderExtInfo;
import com.hzins.channel.api.model.info.OrderInfo;

/**
 * <p>
 * 
 * </p>
 * @author	hz15031081 
 * @date	2015-4-13 下午7:56:26
 * @version      
 */
public class OrderApplyResp {
    
    private String transNo;
    
    // 代理商信息
    private int partnerId;  
    
    // 惠择投保单号
    private String insureNum;
    
    // 保单信息
    private List<OrderInfo> orderInfos;
    
    //保单与被保人关联信息
    List<OrderExtInfo> orderExts;

    
    
    
    
    
    public List<OrderExtInfo> getOrderExts() {
        return orderExts;
    }


    
    public void setOrderExts(List<OrderExtInfo> orderExts) {
        this.orderExts = orderExts;
    }


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
    

    public String getInsureNum() {
        return insureNum;
    }


    
    public void setInsureNum(String insureNum) {
        this.insureNum = insureNum;
    }


    public List<OrderInfo> getOrderInfos() {
        return orderInfos;
    }
    
    public void setOrderInfos(List<OrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
    }

}
 