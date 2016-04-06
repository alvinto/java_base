package com.yyw.design.createmodel.factory.abstractFactory;

/**
 * 抽象工厂模式
 * Created by wangshuai on 2016/4/6.
 */
public abstract class AbstractFactory {
    public abstract Engine getEngine();
    public abstract Aircondition getAircondition();
}
