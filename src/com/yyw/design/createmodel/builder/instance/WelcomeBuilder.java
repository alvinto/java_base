package com.yyw.design.createmodel.builder.instance;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        message = new WelcomeMessage();
    }

    @Override
    public void buildTitle() {
        message.setTitle("欢迎标题");
    }

    @Override
    public void buildBody() {
        message.setBody("欢迎内容");
    }
}
