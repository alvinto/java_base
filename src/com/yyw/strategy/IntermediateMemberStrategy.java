package com.yyw.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("�м���Ա��9.5��");
		return price*0.95;
	}

}
