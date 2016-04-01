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
 * 投保人信息
 * </p>
 * @author	hz15031081 
 * @date	2015-4-2 下午5:46:53
 * @version      
 */
public class ApplicantInfo {
    
    // 投保人姓名
    private String cName;
    
    // 投保人英文名，境外险必填
    private String eName;
    
    // 投保人证件类型
    private int cardType;
    
    // 证件号码
    private String cardCode;
    
    // 性别 0女1男
    private int sex;
    
    // 出生日期
    private String birthday;
    
    // 手机号码
    private String mobile;
    
    // 电子邮箱
    private String email;
    
    // 职业信息
    private String jobInfo;
    
    //国籍
    private String country;
    
    
    
    

    
    public String getCountry() {
        return country;
    }

    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }


    public int getCardType() {
        return cardType;
    }

    
    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    
    public String getCardCode() {
        return cardCode;
    }

    
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    
    public int getSex() {
        return sex;
    }

    
    public void setSex(int sex) {
        this.sex = sex;
    }

    
    public String getBirthday() {
        return birthday;
    }

    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    
    public String getMobile() {
        return mobile;
    }

    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getJobInfo() {
        return jobInfo;
    }

    
    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }
    
}
 