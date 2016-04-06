package com.yyw.design.createmodel.factory.abstractFactory;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class BMW001Factory extends AbstractFactory {
    @Override
    public Engine getEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition getAircondition() {
        return new AirconditionA();
    }
}
