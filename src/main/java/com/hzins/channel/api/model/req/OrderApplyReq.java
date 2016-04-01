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

import java.util.List;

import com.hzins.channel.api.model.ApplicationData;
import com.hzins.channel.api.model.info.ApplicantInfo;
import com.hzins.channel.api.model.info.CalculatePriceDataInfo;
import com.hzins.channel.api.model.info.ExtendInfo;
import com.hzins.channel.api.model.info.HealthInfo;
import com.hzins.channel.api.model.info.InsurantInfo;
import com.hzins.channel.api.model.info.InsureBeneficiaryInfo;

/**
 * <p>
 * 第三方投保对接投保请求消息
 * </p>
 * 
 * @author hz15041177
 * @date 2015-11-5 下午5:56:55
 * @version
 */
public class OrderApplyReq extends BaseReq {

    // 方案代码，每一款保险公司的方案代码都不相同，由慧择分配
    private String caseCode;

    // 订单数据
    private ApplicationData applicationData;

    // 投保人信息
    private ApplicantInfo applicantInfo;

    // 被保人信息
    private List<InsurantInfo> insurantInfos;

    // 扩展信息
    private ExtendInfo extendInfo;

    // 寿险健康险专用实体
    private HealthInfo healthInfo;

    // 寿险投保受益人实体类
    private List<InsureBeneficiaryInfo> insureBenfInfos;

    // 寿险健康险需加入的试算实体类
    private CalculatePriceDataInfo calculatePriceDataInfo;

    // 投保类型 默认为0， 1：节假日不投保 2：节假日投保 3：一年一次 4：一年多次
    private int insureType;

    public CalculatePriceDataInfo getCalculatePriceDataInfo() {
	return calculatePriceDataInfo;
    }

    public void setCalculatePriceDataInfo(CalculatePriceDataInfo calculatePriceDataInfo) {
	this.calculatePriceDataInfo = calculatePriceDataInfo;
    }

    public List<InsureBeneficiaryInfo> getInsureBenfInfos() {
	return insureBenfInfos;
    }

    public void setInsureBenfInfos(List<InsureBeneficiaryInfo> insureBenfInfos) {
	this.insureBenfInfos = insureBenfInfos;
    }

    public HealthInfo getHealthInfo() {
	return healthInfo;
    }

    public void setHealthInfo(HealthInfo healthInfo) {
	this.healthInfo = healthInfo;
    }

    public String getCaseCode() {
	return caseCode;
    }

    public void setCaseCode(String caseCode) {
	this.caseCode = caseCode;
    }

    public ApplicationData getApplicationData() {
	return applicationData;
    }

    public void setApplicationData(ApplicationData applicationData) {
	this.applicationData = applicationData;
    }

    public ApplicantInfo getApplicantInfo() {
	return applicantInfo;
    }

    public void setApplicantInfo(ApplicantInfo applicantInfo) {
	this.applicantInfo = applicantInfo;
    }

    public List<InsurantInfo> getInsurantInfos() {
	return insurantInfos;
    }

    public void setInsurantInfos(List<InsurantInfo> insurantInfos) {
	this.insurantInfos = insurantInfos;
    }

    public ExtendInfo getExtendInfo() {
	return extendInfo;
    }

    public void setExtendInfo(ExtendInfo extendInfo) {
	this.extendInfo = extendInfo;
    }

    public int getInsureType() {
	return insureType;
    }

    public void setInsureType(int insureType) {
	this.insureType = insureType;
    }

}
