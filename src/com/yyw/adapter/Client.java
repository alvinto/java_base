package com.yyw.adapter;

public class Client {
	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.operation2();
		t.operation1();
	}
}
