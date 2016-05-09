package com.yyw.memento;

public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		o.setState("on");
		c.saveMemento(o.createMemento());
		
		o.setState("off");
		o.restoreMemento(c.restoreMemento());
		System.out.println(o.getState());
	}
}
