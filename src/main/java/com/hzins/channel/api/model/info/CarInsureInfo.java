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

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hzins.channel.base.utils.DateTimeDeserializer;
import com.hzins.channel.base.utils.DateTimeSerializer;

/**
 * <p>
 * 
 * 车险投保单信息
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月8日 下午1:54:25
 * @version
 */
public class CarInsureInfo {

    /**
     * 保险公司名称
     */
    private String companyName;

    /**
     * 渠道用户唯一标识
     */
    private String partnerUniqKey;

    /**
     * 投保单号(CX开头+YYMMDD+10000000~99999999随机数）
     */
    private String insureNum;

    /**
     * 投保人姓名
     */
    private String applicant;

    /**
     * 投保人证件类型 1=身份证;2=护照；3=军官证；4=港澳回乡证；5=台胞证；6=组织机构代码证；7=税务登记证；8=其他
     */
    private Byte applicantCardType;

    /**
     * 投保人电话
     */
    private String applicantPhone;

    /**
     * 证件号码
     */
    private String applicantCardNum;

    /**
     * 1:同车主 2：同投保人 3：其他
     */
    private Byte insurantType;

    /**
     * 被保险人
     */
    private String insurant;

    /**
     * 被保险人证件类型
     */
    private Byte insurantCardType;

    /**
     * 被保险人证件号码
     */
    private String insurantCardNum;

    /**
     * 被保人电话
     */
    private String insurantPhone;

    /**
     * 寄送方法 1:配送 2:自提
     */
    private Byte expreWay;

    /**
     * 收件人
     */
    private String expreReceiver;

    /**
     * 配送联系地址
     */
    private String expreAddress;

    /**
     * 配送联系号码
     */
    private String expreMobile;

    /**
     * 车船税保费(冗余)
     */
    private Float travelTaxPremium;

    /**
     * 商业险保费(冗余)
     */
    private Float bussinessPremium;

    /**
     * 交强险保费(冗余)
     */
    private Float strongPremium;

    /**
     * 滞纳金(冗余)
     */
    private Float lateFee;

    /**
     * 用户支付金额
     */
    private Float userPayAmount;

    /**
     * 保费(冗余)
     */
    private Float premium;

    /**
     * 交强险保单号（出单填写）
     */
    private String strongPolicyNum;

    /**
     * 商业险保单号（出单填写）
     */
    private String bussinessPolicyNum;

    /**
     * 出单备注（出单填写）
     */
    private String policyRemark;

    /**
     * 状态： 0=初审中 1=初审失败 2=核保中 3=核保失败 5=核保成功 6=拒保 7=已过期 8=已撤销
     */
    private Byte status;

    /**
     * 支付状态（1=待支付，2=待确认，3=已支付\n）
     */
    private Byte payStatus;

    /**
     * 收款状态（1：待收款 2：已收款）
     */
    private Byte receivePayStatus;

    /**
     * 出单状态（1=未出单 2=已出单）
     */
    private Byte issueStatus;

    /**
     * 用户自己备注
     */
    private String userRemark;

    /**
     * 线上投保使用，假如交强险或商业险投保过，此字段为1
     */
    private Byte hasOnlineQuote;

    /**
     * 支付时间
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date payTime;

    /**
     * 交强险开始时间
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date trafficInsureStartTime;

    /**
     * 交强险结束时间
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date trafficInsureEndTime;

    /**
     * 商业险开始时间
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date busiInsureStartTime;

    /**
     * 商业险结束时间
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private Date busiInsureEndTime;

    public String getCompanyName() {
	return companyName;
    }

    public void setCompanyName(String companyName) {
	this.companyName = companyName;
    }

    public String getPartnerUniqKey() {
	return partnerUniqKey;
    }

    public void setPartnerUniqKey(String partnerUniqKey) {
	this.partnerUniqKey = partnerUniqKey;
    }

    public String getInsureNum() {
	return insureNum;
    }

    public void setInsureNum(String insureNum) {
	this.insureNum = insureNum;
    }

    public String getApplicant() {
	return applicant;
    }

    public void setApplicant(String applicant) {
	this.applicant = applicant;
    }

    public Byte getApplicantCardType() {
	return applicantCardType;
    }

    public void setApplicantCardType(Byte applicantCardType) {
	this.applicantCardType = applicantCardType;
    }

    public String getApplicantPhone() {
	return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
	this.applicantPhone = applicantPhone;
    }

    public String getApplicantCardNum() {
	return applicantCardNum;
    }

    public void setApplicantCardNum(String applicantCardNum) {
	this.applicantCardNum = applicantCardNum;
    }

    public Byte getInsurantType() {
	return insurantType;
    }

    public void setInsurantType(Byte insurantType) {
	this.insurantType = insurantType;
    }

    public String getInsurant() {
	return insurant;
    }

    public void setInsurant(String insurant) {
	this.insurant = insurant;
    }

    public Byte getInsurantCardType() {
	return insurantCardType;
    }

    public void setInsurantCardType(Byte insurantCardType) {
	this.insurantCardType = insurantCardType;
    }

    public String getInsurantCardNum() {
	return insurantCardNum;
    }

    public void setInsurantCardNum(String insurantCardNum) {
	this.insurantCardNum = insurantCardNum;
    }

    public String getInsurantPhone() {
	return insurantPhone;
    }

    public void setInsurantPhone(String insurantPhone) {
	this.insurantPhone = insurantPhone;
    }

    public Byte getExpreWay() {
	return expreWay;
    }

    public void setExpreWay(Byte expreWay) {
	this.expreWay = expreWay;
    }

    public String getExpreReceiver() {
	return expreReceiver;
    }

    public void setExpreReceiver(String expreReceiver) {
	this.expreReceiver = expreReceiver;
    }

    public String getExpreAddress() {
	return expreAddress;
    }

    public void setExpreAddress(String expreAddress) {
	this.expreAddress = expreAddress;
    }

    public String getExpreMobile() {
	return expreMobile;
    }

    public void setExpreMobile(String expreMobile) {
	this.expreMobile = expreMobile;
    }

    public Float getTravelTaxPremium() {
	return travelTaxPremium;
    }

    public void setTravelTaxPremium(Float travelTaxPremium) {
	this.travelTaxPremium = travelTaxPremium;
    }

    public Float getBussinessPremium() {
	return bussinessPremium;
    }

    public void setBussinessPremium(Float bussinessPremium) {
	this.bussinessPremium = bussinessPremium;
    }

    public Float getStrongPremium() {
	return strongPremium;
    }

    public void setStrongPremium(Float strongPremium) {
	this.strongPremium = strongPremium;
    }

    public Float getLateFee() {
	return lateFee;
    }

    public void setLateFee(Float lateFee) {
	this.lateFee = lateFee;
    }

    public Float getUserPayAmount() {
	return userPayAmount;
    }

    public void setUserPayAmount(Float userPayAmount) {
	this.userPayAmount = userPayAmount;
    }

    public Float getPremium() {
	return premium;
    }

    public void setPremium(Float premium) {
	this.premium = premium;
    }

    public String getStrongPolicyNum() {
	return strongPolicyNum;
    }

    public void setStrongPolicyNum(String strongPolicyNum) {
	this.strongPolicyNum = strongPolicyNum;
    }

    public String getBussinessPolicyNum() {
	return bussinessPolicyNum;
    }

    public void setBussinessPolicyNum(String bussinessPolicyNum) {
	this.bussinessPolicyNum = bussinessPolicyNum;
    }

    public String getPolicyRemark() {
	return policyRemark;
    }

    public void setPolicyRemark(String policyRemark) {
	this.policyRemark = policyRemark;
    }

    public Byte getStatus() {
	return status;
    }

    public void setStatus(Byte status) {
	this.status = status;
    }

    public Byte getPayStatus() {
	return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
	this.payStatus = payStatus;
    }

    public Byte getReceivePayStatus() {
	return receivePayStatus;
    }

    public void setReceivePayStatus(Byte receivePayStatus) {
	this.receivePayStatus = receivePayStatus;
    }

    public Byte getIssueStatus() {
	return issueStatus;
    }

    public void setIssueStatus(Byte issueStatus) {
	this.issueStatus = issueStatus;
    }

    public String getUserRemark() {
	return userRemark;
    }

    public void setUserRemark(String userRemark) {
	this.userRemark = userRemark;
    }

    public Byte getHasOnlineQuote() {
	return hasOnlineQuote;
    }

    public void setHasOnlineQuote(Byte hasOnlineQuote) {
	this.hasOnlineQuote = hasOnlineQuote;
    }

    public Date getPayTime() {
	return payTime;
    }

    public void setPayTime(Date payTime) {
	this.payTime = payTime;
    }

    public Date getTrafficInsureStartTime() {
	return trafficInsureStartTime;
    }

    public void setTrafficInsureStartTime(Date trafficInsureStartTime) {
	this.trafficInsureStartTime = trafficInsureStartTime;
    }

    public Date getTrafficInsureEndTime() {
	return trafficInsureEndTime;
    }

    public void setTrafficInsureEndTime(Date trafficInsureEndTime) {
	this.trafficInsureEndTime = trafficInsureEndTime;
    }

    public Date getBusiInsureStartTime() {
	return busiInsureStartTime;
    }

    public void setBusiInsureStartTime(Date busiInsureStartTime) {
	this.busiInsureStartTime = busiInsureStartTime;
    }

    public Date getBusiInsureEndTime() {
	return busiInsureEndTime;
    }

    public void setBusiInsureEndTime(Date busiInsureEndTime) {
	this.busiInsureEndTime = busiInsureEndTime;
    }

}
