package com.yyw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Subject sub = new ProxySubject(new RealSubject());
		sub.doSomething();
		
		
		RealSubject1 real = new RealSubject1();
		
		InvocationHandler handle = new ProxyHandle(real);
		
		Class s = real.getClass();
		
		Subject1 sub1 = (Subject1)Proxy.newProxyInstance(s.getClassLoader(), s.getInterfaces(), handle);
		
		sub1.doSomeThing();
		
		
	}
}
