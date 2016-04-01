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
 * 保单详情查询 保单明细（不包含保险人和被保险人）	
 * </p>
 * @author	hz15041177 
 * @date	2015-5-5 下午3:25:54
 * @version      
 */
public class PolicyDetailInfo {
    
    // 总份数
    private int totalNum;
    
    //生效时间区间
    private String deallineText;
    
    // 支付价
    private double buySinglePrice;
    
    // 结算价
    private double settlementPrice;
    
    //保障项目
    private String insureProject;

    
    public int getTotalNum() {
        return totalNum;
    }

    
    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    
    public String getDeallineText() {
        return deallineText;
    }

    
    public void setDeallineText(String deallineText) {
        this.deallineText = deallineText;
    }

    
    public double getBuySinglePrice() {
        return buySinglePrice;
    }

    
    public void setBuySinglePrice(double buySinglePrice) {
        this.buySinglePrice = buySinglePrice;
    }

    
    public double getSettlementPrice() {
        return settlementPrice;
    }

    
    public void setSettlementPrice(double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    
    public String getInsureProject() {
        return insureProject;
    }

    
    public void setInsureProject(String insureProject) {
        this.insureProject = insureProject;
    }
    
    

}
 