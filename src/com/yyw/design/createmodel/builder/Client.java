package com.yyw.design.createmodel.builder;

import com.yyw.design.createmodel.factory.*;

/**
 * Created by wangshuai on 2016/4/6.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();
        BMW bmw = ((ConcreateBuilder)builder).retrieveResult();
        System.out.println(bmw);
    }
}
