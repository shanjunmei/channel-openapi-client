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
 * 
 * 核心请求基类，排除sign
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月3日 下午4:40:45
 * @version
 */
public class CoreBaseReq {

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
