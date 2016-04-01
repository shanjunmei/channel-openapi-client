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

import com.hzins.channel.api.model.info.ApiPartnerInsureInfo;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月27日 下午3:55:32
 * @version
 */
public class ApiPartnerInsureResp extends BaseResp {

    private List<ApiPartnerInsureInfo> apiPartnerInsureInfos;

    public List<ApiPartnerInsureInfo> getApiPartnerInsureInfos() {
	return apiPartnerInsureInfos;
    }

    public void setApiPartnerInsureInfos(List<ApiPartnerInsureInfo> apiPartnerInsureInfos) {
	this.apiPartnerInsureInfos = apiPartnerInsureInfos;
    }

}
