package com.gupaoedu.vip.pattern.proxy.dynamicproxy.myproxy;

import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.GPClassLoader;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.GPProxy;

import java.lang.reflect.Method;

/**
 *  @author: danssion
 *  @Date: 2019/5/4 19:48
 *  @file: MYMeipo.java
 *  @Description:
 *
 */
public class MYMeipo implements MYInvocationHandler {
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MYClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
