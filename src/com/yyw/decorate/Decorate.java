package com.yyw.decorate;

public class Decorate implements Component {
	Component component;
	
	public Decorate(Component component){
		this.component = component;
	}
	
	@Override
	public void doSomeThing() {
		component.doSomeThing();
	}

}
