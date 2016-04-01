/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.channel.api.model.req;

/**
 * <p>
 * 结算申请请求信息
 * </p>
 * 
 * @author hz15051252
 * @date 2015年6月12日 下午6:58:30
 * @version
 */
public class SettlementBillDetailReq extends SubUserBaseReq {

    // 申请服务费结算之后的settlementBill数据的Id
    private int billId;

    // 查询的申请结算开始时间
    private String startTime;

    // 查询的申请结算结束时间
    private String endTime;

    public String getStartTime() {
	return startTime;
    }

    public void setStartTime(String startTime) {
	this.startTime = startTime;
    }

    public String getEndTime() {
	return endTime;
    }

    public void setEndTime(String endTime) {
	this.endTime = endTime;
    }

    public int getBillId() {
	return billId;
    }

    public void setBillId(int billId) {
	this.billId = billId;
    }

}
