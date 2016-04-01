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
 *子帐号
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月16日 下午4:07:29
 * @version
 */
public abstract class SubUserBaseReq extends BaseReq {

    // 如果是代理商模式，需要传此ID（代理商下级用户Id）
    private String userId;

    public String getUserId() {
	return userId;
    }

    public void setUserId(String userId) {
	this.userId = userId;
    }
}
