package com.yyw.observer;

public class NightObserver extends Observer {

	@Override
	void update(String state) {
		if("白天".equals(state)){
			System.out.println("黑班：天亮了，下班！");
		}
		if("晚上".equals(state)){
			System.out.println("黑班：天黑了，干活！");
		}
	}

}
