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

import com.hzins.channel.api.model.info.CarInfo;
import com.hzins.channel.api.model.info.CarInsureInfo;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月8日 下午1:45:02
 * @version
 */
public class CarInsureDetailResp extends BaseResp {

    /**
     * 车辆信息
     */
    private CarInfo carInfo;

    /**
     * 投保单信息
     */
    private CarInsureInfo insure;

    public CarInfo getCarInfo() {
	return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
	this.carInfo = carInfo;
    }

    public CarInsureInfo getInsure() {
	return insure;
    }

    public void setInsure(CarInsureInfo insure) {
	this.insure = insure;
    }

}
