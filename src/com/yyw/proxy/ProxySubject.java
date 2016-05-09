package com.yyw.proxy;

public class ProxySubject extends Subject {
	RealSubject real;
	
	public ProxySubject(RealSubject real){
		this.real = real;
	}
	
	@Override
	void doSomething() {
		doOtherThing();
		real.doSomething();
	}

	
	private void doOtherThing(){
		System.out.println("代理类的其他方法");
	}
}
