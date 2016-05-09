package com.yyw.decorate;

public class ConcreateComponent implements Component {
	@Override
	public void doSomeThing() {
		System.out.println("具体实施者做事...");
	}

}
