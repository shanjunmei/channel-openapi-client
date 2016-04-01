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
 * 
 * </p>
 * 
 * @author hz15031081
 * @date 2015-5-8 上午11:32:45
 * @version
 */
public class RegisterReq extends SubUserBaseReq {

    // 渠道类型 0：个人 1：公司 (必填)
    private int channelType;

    // 1:户外=1 2:旅行社 3:签证机构 4:旅游网站 0:其他(必填)
    private int webType;

    // 邮箱
    private String email;

    // 登陆密码
    private String loginPassWord;

    // 联系人 必填
    private String contactName;

    // 联系电话 必填
    private String contactNumber;

    // 渠道服务费模板Id(非必填)
    private Integer feetemplateId;

    // 拓展人员名字
    private String expandEmployeeName;

    // 拓展人员ID
    private int expandEmployeeId;

    // 公司代码
    private String companyCode;

    // 公司名称
    private String companyName;

    public String getCompanyCode() {
	return companyCode;
    }

    public void setCompanyCode(String companyCode) {
	this.companyCode = companyCode;
    }

    public String getCompanyName() {
	return companyName;
    }

    public void setCompanyName(String companyName) {
	this.companyName = companyName;
    }

    public String getExpandEmployeeName() {
	return expandEmployeeName;
    }

    public void setExpandEmployeeName(String expandEmployeeName) {
	this.expandEmployeeName = expandEmployeeName;
    }

    public int getExpandEmployeeId() {
	return expandEmployeeId;
    }

    public void setExpandEmployeeId(int expandEmployeeId) {
	this.expandEmployeeId = expandEmployeeId;
    }

    public Integer getFeetemplateId() {
	return feetemplateId;
    }

    public void setFeetemplateId(Integer feetemplateId) {
	this.feetemplateId = feetemplateId;
    }

    public int getChannelType() {
	return channelType;
    }

    public void setChannelType(int channelType) {
	this.channelType = channelType;
    }

    public int getWebType() {
	return webType;
    }

    public void setWebType(int webType) {
	this.webType = webType;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getLoginPassWord() {
	return loginPassWord;
    }

    public void setLoginPassWord(String loginPassWord) {
	this.loginPassWord = loginPassWord;
    }

    public String getContactName() {
	return contactName;
    }

    public void setContactName(String contactName) {
	this.contactName = contactName;
    }

    public String getContactNumber() {
	return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
    }

}
