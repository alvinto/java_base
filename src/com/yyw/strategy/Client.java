package com.yyw.strategy;

public class Client {
	
	public static void main(String[] args) {
		Price price1 = new Price(new AdvancedMemberStrategy());
		System.out.println(price1.quote(100));
		
		Price price2 = new Price(new IntermediateMemberStrategy());
		
		System.out.println(price2.quote(100));
		
		Price price3 = new Price(new PrimaryMemberStrategy());
		System.out.println(price3.quote(100));
	}
}
