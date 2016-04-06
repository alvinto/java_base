package com.yyw.design.createmodel.factory.simpleFactory;

import com.yyw.design.createmodel.factory.BMW;
import com.yyw.design.createmodel.factory.BMW001;
import com.yyw.design.createmodel.factory.BMW002;

/**
 * 简单工厂方法
 * Created by wangshuai on 2016/4/6.
 */
public class BMWFactory {
    public static BMW getBMW(int type){
        switch (type){
            case 1 :
                return new BMW001();
            case 2 :
                return new BMW002();
            default:return null;
        }
    }
}
