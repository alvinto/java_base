package com.yyw.design.createmodel.builder.instance;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class GoodbyBuilder extends Builder {

    public GoodbyBuilder() {
        message = new GoodbyMessage();
    }

    @Override
    public void buildTitle() {
        message.setTitle("欢送标题");
    }

    @Override
    public void buildBody() {
        message.setBody("欢送内容");
    }
}
