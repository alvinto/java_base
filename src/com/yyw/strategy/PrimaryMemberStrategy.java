package com.yyw.strategy;
/**
 * 初级会员价格
 * @author wangshuai
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("初级会员没有折扣！");
		return price;
	}

}
