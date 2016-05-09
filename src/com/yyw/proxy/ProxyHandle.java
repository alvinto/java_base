package com.yyw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyHandle implements InvocationHandler {
	
	Object proxy;
	
	public ProxyHandle(){
	}
	
	public ProxyHandle(Object proxy){
		this.proxy = proxy;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) {
		
		System.out.println("before call method");
		try {
			method.invoke(proxy, args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after call method");
		return null;
	}

}
