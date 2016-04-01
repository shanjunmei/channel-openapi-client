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
 * 产品详情请求信息
 * </p>
 * 
 * @author hz15051252
 * @date 2015年5月21日 下午3:47:29
 * @version
 */
public class ProductDetailReq extends BaseReq {

    // 产品ID
    private int productId;

    // 产品计划Id
    private int planId;

    public int getProductId() {
	return productId;
    }

    public void setProductId(int productId) {
	this.productId = productId;
    }

    public int getPlanId() {
	return planId;
    }

    public void setPlanId(int planId) {
	this.planId = planId;
    }

}
