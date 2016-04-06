package com.yyw.design.createmodel.factory;

import com.yyw.design.createmodel.factory.abstractFactory.AbstractFactory;
import com.yyw.design.createmodel.factory.factoryMethod.BMW001Factory;
import com.yyw.design.createmodel.factory.factoryMethod.BMW002Factory;
import com.yyw.design.createmodel.factory.factoryMethod.BMW003Factory;
import com.yyw.design.createmodel.factory.factoryMethod.MethodFactory;
import com.yyw.design.createmodel.factory.simpleFactory.BMWFactory;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class Customer {
    public static void main(String[] args) {
        //不用工厂模式的话，客户自己创建BMW
        BMW001 bmw001 = new BMW001();
        BMW002 bmw002 = new BMW002();

        //使用简单工厂模式  对客户隐藏创建BMW的细节
        BMW b1 = BMWFactory.getBMW(1);
        BMW b2 = BMWFactory.getBMW(2);

        //使用工厂方法模式  开闭原则，不用像简单工厂模式一样每加一种型号车都要修改简单工厂的方法
        MethodFactory factory1 = new BMW001Factory();
        MethodFactory factory2 = new BMW002Factory();
        MethodFactory factory3 = new BMW003Factory();
        BMW b11 = factory1.getBMW();
        BMW b22 = factory2.getBMW();
        BMW b33 = factory3.getBMW();

        //抽象工厂模式 生产不同BMW类型对应的配件  如果BMW001用A型发动机及A型空调，BMW002用B型发动机及B型空调
        AbstractFactory factory11 = new com.yyw.design.createmodel.factory.abstractFactory.BMW001Factory();
        AbstractFactory factory22 = new com.yyw.design.createmodel.factory.abstractFactory.BMW002Factory();
        factory11.getEngine();
        factory11.getAircondition();
        factory22.getEngine();
        factory22.getAircondition();

    }

}
