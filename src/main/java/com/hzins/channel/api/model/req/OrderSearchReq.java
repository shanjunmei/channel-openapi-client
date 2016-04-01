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

/**
 * <p>
 * 
 * </p>
 * 
 * @author hz15031081
 * @date 2015-7-24 下午7:57:02
 * @version
 */
public class OrderSearchReq extends SubUserBaseReq {

    // 当前页
    private int pageNum;

    // 每页显示数据
    private int pageSize;

    // 投保开始时间
    private String startTime;

    // 投保结束时间
    private String endTime;

    // 投保人姓名
    private String applicant;

    // 被保险人姓名
    private String insurant;

    // 投保人证件号码
    private String idCard;

    // 多个投保单号
    private List<String> insureNums;

    public List<String> getInsureNums() {
	return insureNums;
    }

    public void setInsureNums(List<String> insureNums) {
	this.insureNums = insureNums;
    }

    public String getStartTime() {
	return startTime;
    }

    public void setStartTime(String startTime) {
	this.startTime = startTime;
    }

    public String getEndTime() {
	return endTime;
    }

    public void setEndTime(String endTime) {
	this.endTime = endTime;
    }

    public String getApplicant() {
	return applicant;
    }

    public void setApplicant(String applicant) {
	this.applicant = applicant;
    }

    public String getInsurant() {
	return insurant;
    }

    public void setInsurant(String insurant) {
	this.insurant = insurant;
    }

    public String getIdCard() {
	return idCard;
    }

    public void setIdCard(String idCard) {
	this.idCard = idCard;
    }

    public int getPageNum() {
	return pageNum;
    }

    public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
    }

    public int getPageSize() {
	return pageSize;
    }

    public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
    }

}
