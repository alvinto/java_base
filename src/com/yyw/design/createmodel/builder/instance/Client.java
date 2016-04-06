package com.yyw.design.createmodel.builder.instance;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("aaa","yyw");

        builder.sendMessage();

        builder = new GoodbyBuilder();
        director = new Director(builder);
        director.construct("bbbb","yyw");
        builder.sendMessage();
    }
}
