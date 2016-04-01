package com.hzins.channel.api.model.info;

/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved.
 * <p/>
 * This code is the confidential and proprietary information of
 * Hzins. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the agreements
 * you entered into with Hzins,http://www.hzins.com.
 */


/**
 * <p>
 * 寿险投保受益人实体类
 * </p>
 *  
 * @author	hz15041177 
 * @date	2015-11-5 下午1:46:08
 * @version
 */
public class InsureBeneficiaryInfo {


    //受益人生日
    private String birthdate;

    //证件号码
    private String cardNumber;

    //证件类型
    private int cardTypeId;

    //受益人名字
    private String cName;

    //与被保人关系
    private int relationId;

    //受益人顺序
    private short serial;

    private boolean sex;

    //受益人比率
    private double proportion;

    
    public String getBirthdate() {
        return birthdate;
    }

    
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    
    public String getCardNumber() {
        return cardNumber;
    }

    
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    
    public int getCardTypeId() {
        return cardTypeId;
    }

    
    public void setCardTypeId(int cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    
    public String getcName() {
        return cName;
    }

    
    public void setcName(String cName) {
        this.cName = cName;
    }

    
    public int getRelationId() {
        return relationId;
    }

    
    public void setRelationId(int relationId) {
        this.relationId = relationId;
    }

    
    public short getSerial() {
        return serial;
    }

    
    public void setSerial(short serial) {
        this.serial = serial;
    }

    
    public boolean isSex() {
        return sex;
    }

    
    public void setSex(boolean sex) {
        this.sex = sex;
    }

    
    public double getProportion() {
        return proportion;
    }

    
    public void setProportion(double proportion) {
        this.proportion = proportion;
    }

    
    

}
