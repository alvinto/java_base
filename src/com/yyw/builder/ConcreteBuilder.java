package com.yyw.builder;

public class ConcreteBuilder implements Builder{
	
	private Product product = new Product();

	@Override
	public void buildPart1() {
		System.out.println("创建part1...");
		product.setPart1("part1");
	}

	@Override
	public void buildPart2() {
		System.out.println("创建part2...");
		product.setPart2("part2");
	}

	@Override
	public void buildPart3() {
		System.out.println("创建part3...");
		product.setPart3("part3");
	}

	@Override
	public Product getResult() {
		return product;
	}
	
}
