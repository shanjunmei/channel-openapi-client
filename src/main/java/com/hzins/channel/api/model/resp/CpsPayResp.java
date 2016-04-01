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
 * 异步投保 在线CPS页面支付 返回的实体（含支付链接）
 * </p>
 * 
 * @author hz15041177
 * @date 2015-4-29 下午2:23:58
 * @version
 */
public class CpsPayResp {

    /**
     * @date 2015-4-29 下午2:32:45
     * @version
     */

    private String transNo;

    private String insureNum;

    private String paymentUrl;

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    public String getPaymentUrl() {
	return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
	this.paymentUrl = paymentUrl;
    }

    public String getTransNo() {
	return transNo;
    }

    public void setTransNo(String transNo) {
	this.transNo = transNo;
    }

}
