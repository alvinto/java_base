package com.yyw.observer;

import java.text.MessageFormat;

public class ConcreteSubject extends Subject {
	private String state;

	public ConcreteSubject(){
		this.state="";
	}
	
	@Override
	void change(String state) {
		System.out.println(MessageFormat.format("被观察者改变状态,从{0}改变为{1}", new Object[]{this.state,state}));
		this.state = state;
		nodifyObservers(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
