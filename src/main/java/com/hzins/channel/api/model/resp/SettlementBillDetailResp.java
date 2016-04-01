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

import com.hzins.channel.api.model.info.SettlementBillDetailInfo;

/**
 * <p>
 * 结算申请返回
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午7:12:25
 * @version      
 */
public class SettlementBillDetailResp {

    private String transNo;
    
    private int partnerId;
    
    private List<SettlementBillDetailInfo> settlementBillDetails;

    
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

    
    public List<SettlementBillDetailInfo> getSettlementBillDetails() {
        return settlementBillDetails;
    }

    
    public void setSettlementBillDetails(List<SettlementBillDetailInfo> settlementBillDetails) {
        this.settlementBillDetails = settlementBillDetails;
    }
    
    
}
 