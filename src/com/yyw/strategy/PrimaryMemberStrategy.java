package com.yyw.strategy;
/**
 * ������Ա�۸�
 * @author wangshuai
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double price) {
		System.out.println("������Աû���ۿۣ�");
		return price;
	}

}
