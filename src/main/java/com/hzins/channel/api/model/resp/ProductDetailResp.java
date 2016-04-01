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

import java.util.List;

import com.hzins.channel.api.model.PlanDetail;

public class ProductDetailResp extends BaseResp{

    private String productName;
    
    private String planName;

    private Integer productId;

//    private String introduction;

    private int planId;

    private List<PlanDetail> planDetails;
    
//    private List<Map<String, String>> planParams;

    private double price;
    
    
    

    
    public List<PlanDetail> getPlanDetails() {
        return planDetails;
    }


    
    public void setPlanDetails(List<PlanDetail> planDetails) {
        this.planDetails = planDetails;
    }


    public String getPlanName() {
        return planName;
    }

    
    public void setPlanName(String planName) {
        this.planName = planName;
    }


    public int getPlanId() {
	return planId;
    }

    public void setPlanId(int planId) {
	this.planId = planId;
    }


    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    
    public String getProductName() {
        return productName;
    }

    
    public void setProductName(String productName) {
        this.productName = productName;
    }



    
    public Integer getProductId() {
        return productId;
    }


    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    

}
