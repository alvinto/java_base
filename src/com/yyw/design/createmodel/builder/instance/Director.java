package com.yyw.design.createmodel.builder.instance;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String toAddress , String fromAddress){
        builder.buildTo(toAddress);
        builder.buildFrom(fromAddress);
        builder.buildTitle();
        builder.buildBody();
        builder.buildDate();
    }
}
