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

import com.hzins.channel.api.model.info.ExtendInfo;

/**
 * <p>
 * 退保请求消息
 * </p>
 * 
 * @author hz15031081
 * @date 2015-4-9 下午3:22:12
 * @version
 */
public class OrderCancelReq extends BaseReq {

    private String insureNo;

    private String insureNum;

    // 扩展信息
    private ExtendInfo extendInfo;

    public String getInsureNo() {
	return insureNo;
    }

    public void setInsureNo(String insureNo) {
	this.insureNo = insureNo;
    }

    public ExtendInfo getExtendInfo() {
	return extendInfo;
    }

    public void setExtendInfo(ExtendInfo extendInfo) {
	this.extendInfo = extendInfo;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

}
