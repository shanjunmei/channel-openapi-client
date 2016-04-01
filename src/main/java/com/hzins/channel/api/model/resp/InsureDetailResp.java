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

import com.hzins.channel.api.model.info.ApplicantInfo;
import com.hzins.channel.api.model.info.InsurantInfo;
import com.hzins.channel.api.model.info.PolicyDetailInfo;

/**
 * <p>
 * 保单查询返回信息
 * </p>
 * @author	hz15041177 
 * @date	2015-5-5 下午2:48:45
 * @version      
 */
public class InsureDetailResp {
    
    

    // 投保人信息
    private ApplicantInfo applicantInfo;

    // 被保险人信息
    private List<InsurantInfo> insurantInfos;
    
    // 保单明细
    private PolicyDetailInfo policyDetailInfo;
    
    // 紧急联系人
    private String contact;

    // 紧急联系人电话
    private String contactMob;
    
    // 保险公司名称
    private String companyName;
    
    // 产品名称
    private String prodName;

    //流水号
    private String transNo;
    
    //渠道号
    private int partnerId;
    
    //投保单号
    private String insureNum;
    
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

    
    public PolicyDetailInfo getPolicyDetailInfo() {
        return policyDetailInfo;
    }

    
    public void setPolicyDetailInfo(PolicyDetailInfo policyDetailInfo) {
        this.policyDetailInfo = policyDetailInfo;
    }

    
    public String getContact() {
        return contact;
    }

    
    public void setContact(String contact) {
        this.contact = contact;
    }

    
    public String getContactMob() {
        return contactMob;
    }

    
    public void setContactMob(String contactMob) {
        this.contactMob = contactMob;
    }

    
    public String getCompanyName() {
        return companyName;
    }

    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    public String getProdName() {
        return prodName;
    }

    
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }


    
    public String getTransNo() {
        return transNo;
    }


    
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }


    
    public int getPartnerId() {
        return partnerId;
    }


    
    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }


    
    public String getInsureNum() {
        return insureNum;
    }


    
    public void setInsureNum(String insureNum) {
        this.insureNum = insureNum;
    }
    
    
    
}

 