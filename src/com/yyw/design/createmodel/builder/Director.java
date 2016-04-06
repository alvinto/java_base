package com.yyw.design.createmodel.builder;

/**
 * 导演者类
 * Created by wangshuai on 2016/4/6.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件的创建方法
     */
    public void construct(){
        builder.buildAircondition();
        builder.buildEngine();
        builder.buildTyre();
    }
}
