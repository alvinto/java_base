package com.yyw.design;

public class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.INSTANCE;
		Singleton s2 = Singleton.INSTANCE;
		System.out.println((s1 == s2) +s1.getName()+s2.getName());
	}
}
