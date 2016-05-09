package com.yyw.decorate;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreateComponent();
		
		Decorate decorate1 = new ConcreateDecorate(component);
		
		Decorate decorate2 = new ConDecorate(component);
		
		decorate1.doSomeThing();
		
		decorate2.doSomeThing();
	}
}
