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
 * 支付接口请求对象
 * </p>
 * 
 * @author hz15031081
 * @date 2015-4-27 上午11:26:02
 * @version
 */
public class AppPrePayReq extends SubUserBaseReq {

    // 投保单号
    private String orderNum;

    // 1 支付宝,21 微信充值
    private int payGatewayId;

    // 银行编号，目前只支持微信和支付宝支付，暂时此字段不对外开放
    private int bankId;

    // 安卓3 ios 6
    private int appTypeId;

    // IP地址
    private String ip;

    private String insureNum;

    public int getAppTypeId() {
	return appTypeId;
    }

    public void setAppTypeId(int appTypeId) {
	this.appTypeId = appTypeId;
    }

    public String getIp() {
	return ip;
    }

    public void setIp(String ip) {
	this.ip = ip;
    }

    public int getBankId() {
	return bankId;
    }

    public void setBankId(int bankId) {
	this.bankId = bankId;
    }

    public String getOrderNum() {
	return orderNum;
    }

    public void setOrderNum(String orderNum) {
	this.orderNum = orderNum;
    }

    public int getPayGatewayId() {
	return payGatewayId;
    }

    public void setPayGatewayId(int payGatewayId) {
	this.payGatewayId = payGatewayId;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

}
