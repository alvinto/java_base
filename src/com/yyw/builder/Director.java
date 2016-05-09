package com.yyw.builder;

public class Director {
	public Product construct(Builder builder){
		builder.buildPart1();
		builder.buildPart2();
		builder.buildPart3();
		
		return builder.getResult();
	}
}
