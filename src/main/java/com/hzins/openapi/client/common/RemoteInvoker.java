/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.openapi.client.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

import org.hzins.common.utils.Md5Utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hzins.channel.api.model.common.CommonResult;
import com.hzins.openapi.client.Configure;

/**
 * <p>
 * 
 * 远程方法调用
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月7日 上午8:00:52
 * @version
 */
public class RemoteInvoker {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> CommonResult<T> invoke(Type returnType, String api, Object obj) {

	api = Configure.Request.baseUrl + api;

	try {
	    String requestBody = objectMapper.writeValueAsString(obj);
	    api = sign(api, requestBody);
	    URL url = new URL(api);
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.addRequestProperty("Content-Type", Configure.Request.contentType);
	    connection.addRequestProperty("User-Agent", Configure.Request.userAgent);
	    connection.setConnectTimeout(Configure.Request.http_connection_timeout);
	    connection.setReadTimeout(Configure.Request.http_read_timeout);
	    connection.setRequestMethod("POST");
	    connection.setDoOutput(true);
	    connection.getOutputStream().write(requestBody.getBytes("utf8"));
	    int status = connection.getResponseCode();

	    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
	    StringBuffer message = new StringBuffer();
	    while (reader.ready()) {
		message.append(reader.readLine());
	    }
	    reader.close();
	    connection.connect();
	    if (status == 200) {
		CommonResult<T> res = objectMapper.readValue(message.toString(), getResponseType(returnType));
		return res;
	    } else {
		throw new RuntimeException(message.toString());
	    }
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}

    }

    private static String sign(String api, String body) {
	if (Configure.Channel.channelKey == null) {
	    throw new RuntimeException("请先配置渠道密钥:" + Configure.Channel.class + "#channelKey");
	}
	body = Configure.Channel.channelKey + body;
	String sign = Md5Utils.getUtf8MD5String(body);
	api = api + "?sign=" + sign;
	return api;
    }

    private static JavaType getResponseType(Type type) {
	return objectMapper.getTypeFactory().constructType(type);
    }
}
