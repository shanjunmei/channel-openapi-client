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
 * </p>
 * 
 * @author hz15031081
 * @date 2015-4-15 下午7:25:50
 * @version
 */
public class OrderCancelResp {

    private String transNo;

    private int partnerId;

    private String insureNo;

    private String insureNum;

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

    public String getInsureNo() {
	return insureNo;
    }

    public void setInsureNo(String insureNo) {
	this.insureNo = insureNo;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

}
