package com.yyw.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("中级会员打9.5折");
		return price*0.95;
	}

}
