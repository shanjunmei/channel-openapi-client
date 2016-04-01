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

import com.hzins.channel.api.model.info.ProductInfo;

/**
 * <p>
 *  产品详情返回实体
 * </p>
 * @author	hz15051252 
 * @date	2015年5月21日 下午5:16:15
 * @version      
 */
public class ProductListResp extends BaseResp {


    
    private List<ProductInfo> productInfos;

    
    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    
    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }
    
    
}
 