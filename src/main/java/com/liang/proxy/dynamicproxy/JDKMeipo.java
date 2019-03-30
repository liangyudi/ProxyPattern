package com.liang.proxy.dynamicproxy;

import com.liang.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/3/30
 * Liangyudi-PC
 */
public class JDKMeipo implements InvocationHandler {

    private Object object;

    public Object getInstance(Object o){
        this.object = o;
        ClassLoader classLoader = o.getClass().getClassLoader();
        Class<?>[] interfaces = o.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,interfaces,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object obj = method.invoke(this.object, args);
        after();
        //System.out.println("代理类名称+++"+proxy.getClass().getName());
        return obj;
    }

    private void before(){
        System.out.println("媒婆：开始物色对象。");
    }

    private void after(){
        System.out.println("媒婆：对象合适，牵手成功。");
    }
}
