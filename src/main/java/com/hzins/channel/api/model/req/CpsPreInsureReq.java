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

import com.hzins.channel.api.model.info.ApplicantInfo;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月25日 下午3:20:39
 * @version
 */
public class CpsPreInsureReq extends BaseReq {

    private String caseCode;

    private String platform;

    private String partnerUniqueKey;

    // 投保人信息
    private ApplicantInfo applicantInfo;

    public String getCaseCode() {
	return caseCode;
    }

    public void setCaseCode(String caseCode) {
	this.caseCode = caseCode;
    }

    public String getPlatform() {
	return platform;
    }

    public void setPlatform(String platform) {
	this.platform = platform;
    }

    public String getPartnerUniqueKey() {
	return partnerUniqueKey;
    }

    public void setPartnerUniqueKey(String partnerUniqueKey) {
	this.partnerUniqueKey = partnerUniqueKey;
    }

    public ApplicantInfo getApplicantInfo() {
	return applicantInfo;
    }

    public void setApplicantInfo(ApplicantInfo applicantInfo) {
	this.applicantInfo = applicantInfo;
    }

}
