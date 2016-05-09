package com.yyw.proxy;

public class RealSubject extends Subject{

	@Override
	void doSomething() {
		System.out.println("真实的类的doSomething方法");
	}

}
