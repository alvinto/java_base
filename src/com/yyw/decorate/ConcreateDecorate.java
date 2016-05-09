package com.yyw.decorate;

public class ConcreateDecorate extends Decorate {

	public ConcreateDecorate(Component component) {
		super(component);
	}
	
	@Override
	public void doSomeThing() {
		component.doSomeThing();
		doOtherThing();
	}
	
	private void doOtherThing(){
		System.out.println("装饰者做其他事儿。。。。");
	}
}
