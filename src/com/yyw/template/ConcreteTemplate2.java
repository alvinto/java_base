package com.yyw.template;

public class ConcreteTemplate2 extends AbstractTemplate{

	@Override
	public void abstractMethod() {
		System.out.println("����2ʵ�ֳ��󷽷�");
	}
	
	@Override
	public void hookMethod() {
		System.out.println("����2���ع��ӷ���");
	}

}
