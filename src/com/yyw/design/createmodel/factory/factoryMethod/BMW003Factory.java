package com.yyw.design.createmodel.factory.factoryMethod;

import com.yyw.design.createmodel.factory.BMW;
import com.yyw.design.createmodel.factory.BMW003;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class BMW003Factory implements MethodFactory {
    @Override
    public BMW getBMW() {
        return new BMW003();
    }
}
