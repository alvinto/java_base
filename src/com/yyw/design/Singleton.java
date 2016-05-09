package com.yyw.design;

public enum Singleton {
	INSTANCE("111","12");
	
	private String name;
	private String age;
	
	Singleton(String name,String age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
