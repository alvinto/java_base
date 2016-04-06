package com.yyw.design.createmodel.factory.abstractFactory;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class BMW002Factory extends AbstractFactory {
    @Override
    public Engine getEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition getAircondition() {
        return new AirconditionB();
    }
}
