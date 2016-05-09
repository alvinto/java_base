package com.yyw.memento;

public class Originator {
	private String state;

	/**
	 * �������� ����һ���µı���¼
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(state);
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("���÷�����״̬Ϊ"+state);
	}
	/**
	 * ���ݱ���¼�ָ�������״̬
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
		System.out.println("�ָ�������״̬Ϊ"+state);
	}
}
