package com.yyw.template;

public class ConcreteTemplate2 extends AbstractTemplate{

	@Override
	public void abstractMethod() {
		System.out.println("子类2实现抽象方法");
	}
	
	@Override
	public void hookMethod() {
		System.out.println("子类2重载钩子方法");
	}

}
