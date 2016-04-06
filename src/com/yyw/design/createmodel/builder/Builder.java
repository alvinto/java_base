package com.yyw.design.createmodel.builder;

import com.yyw.design.createmodel.factory.*;

/**
 * 抽象建造者类
 * Created by wangshuai on 2016/4/6.
 */
public interface Builder {
    /**
     * 制造发动机
     */
    public void buildEngine();

    /**
     * 制造空调
     */
    public void buildAircondition();

    /**
     * 制造轮胎
     */
    public void buildTyre();
}
