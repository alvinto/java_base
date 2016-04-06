package com.yyw.design.createmodel.builder.instance;

import java.util.Date;

/**
 * 抽象建造类
 * Created by wangshuai on 2016/4/6.
 */
public abstract class Builder {
    protected AutoMessage message;
    public void buildTo(String to){
        message.setTo(to);
    }
    public void buildFrom(String from){
        message.setFrom(from);
    }
    public abstract void buildTitle();
    public abstract void buildBody();
    public void buildDate(){
        message.setDate(new Date());
    }
    public void sendMessage(){
        message.send();
    }
}
