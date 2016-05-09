package com.yyw.observer;

public class Client {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		Observer o1 = new DayObserver();
		Observer o2 = new NightObserver();
		sub.add(o1);
		sub.add(o2);
		
		sub.change("°×Ìì");
		sub.change("ÍíÉÏ");
	}
}
