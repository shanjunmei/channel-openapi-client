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
 * 车险预投保返回
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月3日 下午4:44:22
 * @version
 */
public class CarPreInsureResp extends BaseResp {

    // 车险入口
    private String carInsureEntranceUrl;

    public String getCarInsureEntranceUrl() {
	return carInsureEntranceUrl;
    }

    public void setCarInsureEntranceUrl(String carInsureEntranceUrl) {
	this.carInsureEntranceUrl = carInsureEntranceUrl;
    }

}
