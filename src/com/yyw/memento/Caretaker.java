package com.yyw.memento;

public class Caretaker {
	private Memento memento;
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
	public Memento  restoreMemento(){
		return memento;
	}
}
