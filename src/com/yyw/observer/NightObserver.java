package com.yyw.observer;

public class NightObserver extends Observer {

	@Override
	void update(String state) {
		if("����".equals(state)){
			System.out.println("�ڰࣺ�����ˣ��°࣡");
		}
		if("����".equals(state)){
			System.out.println("�ڰࣺ����ˣ��ɻ");
		}
	}

}
