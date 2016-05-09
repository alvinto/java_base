package com.yyw.builder;

public class Test {
	
	public static void main(String[] args) {
		Director d = new Director();
		
		Builder b = new ConcreteBuilder();
		
		Product p = d.construct(b);
		
		System.out.println(p.toString());
	}
}
