package com.yyw.decorate;

public class ConDecorate extends Decorate {
	
	public ConDecorate(Component component) {
		super(component);
	}

	@Override
	public void doSomeThing() {
		super.doSomeThing();
		doOtherThing();
	}
	
	private void doOtherThing(){
		System.out.println("继承者2做其他事情....");
	}
}
