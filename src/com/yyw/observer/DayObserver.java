package com.yyw.observer;

public class DayObserver extends Observer {

	@Override
	void update(String state) {
		if("白天".equals(state)){
			System.out.println("白班:天亮了，干活！");
		}
		if("晚上".equals(state)){
			System.out.println("白班：天黑了，下班！");
		}
	}

}
