package com.gupaoedu.vip.pattern.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;


/**
 *  @author: danssion
 *  @Date: 2019/5/4 17:33
 *  @file: MYInvocationHandler.java
 *  @Description:
 *
 */
public interface MYInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
