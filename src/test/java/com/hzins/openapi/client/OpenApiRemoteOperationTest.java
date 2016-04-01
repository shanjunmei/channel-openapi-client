/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.openapi.client;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzins.channel.api.model.ApplicationData;
import com.hzins.channel.api.model.common.CommonResult;
import com.hzins.channel.api.model.info.ApplicantInfo;
import com.hzins.channel.api.model.info.InsurantInfo;
import com.hzins.channel.api.model.req.OrderApplyReq;
import com.hzins.channel.api.model.req.ProductListReq;
import com.hzins.channel.api.model.resp.OrderApplyResp;
import com.hzins.channel.api.model.resp.ProductListResp;
import com.hzins.openapi.client.common.ProxyFactory;

/**
 * <p>
 * 
 * 调用示例
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月6日 下午3:36:08
 * @version
 */
public class OpenApiRemoteOperationTest {

    static OpenApiRemoteOperation operation = ProxyFactory.create(OpenApiRemoteOperation.class);

    ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
	new OpenApiRemoteOperationTest().testProductList();
    }

   
    public void testProductList() throws JsonProcessingException {
	ProductListReq req = new ProductListReq();
	//req.setPartnerId(Configure.Channel.partnerId);
	req.setTransNo("test");

	CommonResult<ProductListResp> res = operation.productList(req);
	System.out.println(objectMapper.writeValueAsString(res));
    }

  
    public void testOrderApply() throws JsonProcessingException {
	OrderApplyReq req = new OrderApplyReq();
	ApplicantInfo applicantInfo = new ApplicantInfo();
	ApplicationData applicationData = new ApplicationData();
	List<InsurantInfo> insurantInfos = new ArrayList<InsurantInfo>();

	req.setApplicantInfo(applicantInfo);
	req.setApplicationData(applicationData);
	req.setInsurantInfos(insurantInfos);

	applicationData.setApplicationDate("2015-08-05 09:40:00");
	applicationData.setStartDate("2016-12-10");
	applicationData.setEndDate("2016-12-19");

	applicantInfo.setcName("吕越彬");
	applicantInfo.seteName("seven");
	applicantInfo.setCardType(1);
	applicantInfo.setCardCode("52263519890117727X");
	applicantInfo.setSex(1);
	applicantInfo.setBirthday("1989-01-17");
	applicantInfo.setMobile("13800000000");
	applicantInfo.setEmail("seven@hzins.com");

	InsurantInfo insurantInfo = new InsurantInfo();
	insurantInfos.add(insurantInfo);
	insurantInfo.setInsurantId("1001");
	insurantInfo.setcName("beishuwen");
	insurantInfo.seteName("seven");
	insurantInfo.setSex(1);
	insurantInfo.setCardType(2);
	insurantInfo.setCardCode("12349");
	insurantInfo.setBirthday("1984-04-07");
	insurantInfo.setRelationId(6);
	insurantInfo.setCount(1);
	insurantInfo.setSinglePrice(209.0);
	insurantInfo.setCity("深圳");
	insurantInfo.setTripPurposeId(0);

	req.setTransNo("HZ201504212000019");
	req.setPartnerId(Configure.Channel.partnerId);
	req.setCaseCode("0000056044100441");


	CommonResult<OrderApplyResp> res = operation.orderApply(req);

	System.out.println(objectMapper.writeValueAsString(res));

    }

}
