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

/**
 * <p>
 *  产品详情返回实体
 * </p>
 * @author	hz15051252 
 * @date	2015年5月21日 下午5:16:15
 * @version      
 */
public class ProductInfo {


    private int prodId;

    private String name;

    private String caseCode;


    private String companyName;



    private int planId;

    private String planName;

   


    public int getProdId() {
	return prodId;
    }

    public void setProdId(int prodId) {
	this.prodId = prodId;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getCaseCode() {
	return caseCode;
    }

    public void setCaseCode(String caseCode) {
	this.caseCode = caseCode;
    }


    public String getCompanyName() {
	return companyName;
    }

    public void setCompanyName(String companyName) {
	this.companyName = companyName;
    }


    public int getPlanId() {
	return planId;
    }

    public void setPlanId(int planId) {
	this.planId = planId;
    }

    public String getPlanName() {
	return planName;
    }

    public void setPlanName(String planName) {
	this.planName = planName;
    }

}
 