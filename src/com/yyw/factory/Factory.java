package com.yyw.factory;

public class Factory {
	public BMW getInstance(int type){
		switch(type){
		case 1:
			return new BMW001();
		case 2:
			return new BMW002();
		default:
			break;
		}
		return null;
	}
}
