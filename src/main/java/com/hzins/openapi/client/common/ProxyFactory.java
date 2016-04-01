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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * 
 * 代理工厂
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月7日 上午8:03:17
 * @version
 */
public class ProxyFactory {

    /**
     * 
     * <p>
     * 
     * 动态代理创建
     *
     * </p>
     * 
     * @param cls
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午8:05:43
     * @version
     */
    @SuppressWarnings("unchecked")
    public static <I> I create(Class<I> cls) {
	return (I) Proxy.newProxyInstance(cls.getClassLoader(), new Class[] { cls }, new InvokerProxy());
    }

    static class InvokerProxy implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	    Api api = method.getAnnotation(Api.class);
	    String methodName = method.getName();
	    if (api != null && api.value() != null && api.value().trim().length() > 0) {
		methodName = api.value();
	    }
	   
	    int pc = method.getParameterTypes().length;
	    if (pc == 1) {
		return RemoteInvoker.invoke(method.getGenericReturnType(), methodName, args[0]);
	    } else {
		return RemoteInvoker.invoke(method.getGenericReturnType(), methodName, args);
	    }

	}
    }

}
