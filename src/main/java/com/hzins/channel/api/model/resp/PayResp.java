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
 * 支付接口返回参数
 * </p>
 * 
 * @author hz15031081
 * @date 2015-4-27 上午11:26:31
 * @version
 */
public class PayResp {

    private String transNo;

    private String orderNum;

    private String insureNum;

    private String content;
    
    private String bsId;

    public String getTransNo() {
	return transNo;
    }

    public void setTransNo(String transNo) {
	this.transNo = transNo;
    }

    public String getOrderNum() {
	return orderNum;
    }

    public void setOrderNum(String orderNum) {
	this.orderNum = orderNum;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    
    public String getBsId() {
        return bsId;
    }

    
    public void setBsId(String bsId) {
        this.bsId = bsId;
    }
    

}
