package com.yyw.template;

public abstract class AbstractTemplate {
	public void templateMethod(){
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	//�������ʵ�ֵķ���
	public abstract void abstractMethod();
	//���ӷ������������ʵ��
	public void hookMethod(){};
	
	private void concreteMethod(){
		System.out.println("��ʵ�ֵķ���");
	}
}
