package com.yyw.template;

public abstract class AbstractTemplate {
	public void templateMethod(){
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	//子类必须实现的方法
	public abstract void abstractMethod();
	//钩子方法，子类可以实现
	public void hookMethod(){};
	
	private void concreteMethod(){
		System.out.println("已实现的方法");
	}
}
