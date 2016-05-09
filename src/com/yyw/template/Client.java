package com.yyw.template;

public class Client {
	public static void main(String[] args) {
		AbstractTemplate a1 = new ConcreteTemplate1();
		a1.templateMethod();
		
		AbstractTemplate a2 = new ConcreteTemplate2();
		a2.templateMethod();
	}
}
