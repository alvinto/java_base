package com.yyw.design.createmodel.builder;

import com.yyw.design.createmodel.factory.*;

/**
 * 具体建造者类
 * Created by wangshuai on 2016/4/6.
 */
public class ConcreateBuilder implements Builder{
    private BMW bmw = new BMW();
    @Override
    public void buildEngine() {
        bmw.setEngine("发动机型号001");
    }

    @Override
    public void buildAircondition() {
        bmw.setAircondition("空调型号001");
    }

    @Override
    public void buildTyre() {
        bmw.setTyre("轮胎型号001");
    }

    public BMW retrieveResult(){
        return bmw;
    }
}
