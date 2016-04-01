/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.channel.api.model.info;

import java.util.List;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月27日 下午3:56:57
 * @version
 */
public class ApiPartnerInsureInfo {

    /**
     * 渠道用户身份标识
     */
    private String partnerUniqueKey;

    /**
     * 投保单号
     */
    private String insureNo;

    /**
     * 订单详情
     */
    private List<OrderDetailInfo> orderDetailInfos;

    public String getPartnerUniqueKey() {
	return partnerUniqueKey;
    }

    public void setPartnerUniqueKey(String partnerUniqueKey) {
	this.partnerUniqueKey = partnerUniqueKey;
    }

    public String getInsureNo() {
	return insureNo;
    }

    public void setInsureNo(String insureNo) {
	this.insureNo = insureNo;
    }

    public List<OrderDetailInfo> getOrderDetailInfos() {
	return orderDetailInfos;
    }

    public void setOrderDetailInfos(List<OrderDetailInfo> orderDetailInfos) {
	this.orderDetailInfos = orderDetailInfos;
    }

}
