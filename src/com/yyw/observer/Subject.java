package com.yyw.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observerList = new ArrayList<Observer>();
	
	public void add(Observer observer){
		observerList.add(observer);
	}
	
	public void delete(Observer observer){
		observerList.remove(observer);
	}
	
	public void nodifyObservers(String newState){
		for(Observer o : observerList){
			o.update(newState);
		}
	}
	
	abstract void change(String state);
}
