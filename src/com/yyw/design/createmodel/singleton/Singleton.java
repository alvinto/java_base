package com.yyw.design.createmodel.singleton;

/**
 * 单例模式
 * Created by wangshuai on 2016/4/6.
 */
public class Singleton {
    private Singleton(){}
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
