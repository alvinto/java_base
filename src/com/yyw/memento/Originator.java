package com.yyw.memento;

public class Originator {
	private String state;

	/**
	 * 工厂方法 返回一个新的备忘录
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
		System.out.println("设置发起人状态为"+state);
	}
	/**
	 * 根据备忘录恢复发起人状态
	 * @param memento
	 */
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
		System.out.println("恢复发起人状态为"+state);
	}
}
