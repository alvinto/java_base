package com.yyw.observer;

public class DayObserver extends Observer {

	@Override
	void update(String state) {
		if("����".equals(state)){
			System.out.println("�װ�:�����ˣ��ɻ");
		}
		if("����".equals(state)){
			System.out.println("�װࣺ����ˣ��°࣡");
		}
	}

}
