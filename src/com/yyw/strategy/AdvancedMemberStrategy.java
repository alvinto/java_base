package com.yyw.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("�߼���Ա��8��");
		return price*0.8;
	}

}
