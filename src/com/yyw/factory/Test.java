package com.yyw.factory;

public class Test {
	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.getInstance(1);
		factory.getInstance(2);
	}
}
