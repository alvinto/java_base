package com.yyw.strategy;

public class Price {
	MemberStrategy strtegy;
	
	public Price(MemberStrategy strtegy){
		this.strtegy = strtegy;
	}
	
	public double quote(double price){
		return strtegy.calcPrice(price);
	}
}
