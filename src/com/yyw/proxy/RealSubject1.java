package com.yyw.proxy;

public class RealSubject1 implements Subject1{

	@Override
	public void doSomeThing() {
		System.out.println("真实的类的doSomething方法");
	}

}
