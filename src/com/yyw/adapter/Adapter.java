package com.yyw.adapter;

//public class Adapter extends Adaptee implements Target  {
//	@Override
//	public void operation2() {
//		System.out.println("operation2");
//	}
//}

public class Adapter implements Target{
	Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public void operation1() {
		adaptee.operation1();
	}

	@Override
	public void operation2() {
		System.out.println("operation2");
	}
}
