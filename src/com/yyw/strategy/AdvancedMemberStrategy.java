package com.yyw.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("高级会员打8折");
		return price*0.8;
	}

}
