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

/**
 * <p>
 * 
 *sdk配置
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月6日 下午3:11:57
 * @version
 */
public class Configure {

    
    public static class Channel {

	//渠道号
	public static Integer partnerId =null ;//22803

	//渠道密钥
	public static String channelKey = null;//22803^*#%
    }

    public static class Request {

	//请求url前缀
	public static String baseUrl = "http://channel.hzins.com/api/";

	//连接超时
	public static int http_connection_timeout = 0;// ms为单位
						      // 默认为0，系统默认超时时间，根据操作系统而定
	//读取响应超时
	public static int http_read_timeout = 0;// ms为单位
						// 默认为0，系统默认超时时间，根据操作系统而定

	//userAgent
	public final static String userAgent = "Channel OpenApi Sdk(v1.1)";

	//contentType
	public final static String contentType = "application/json;charset=UTF-8";
    }

}
