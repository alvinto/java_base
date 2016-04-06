package com.yyw.design.createmodel.builder;

/**
 * 一台BMW包含很多零件
 * Created by wangshuai on 2016/4/6.
 */
public class BMW {
    /**发动机*/
    private String engine;
    /**空调**/
    private String aircondition;
    /**轮胎*/
    private String tyre;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAircondition() {
        return aircondition;
    }

    public void setAircondition(String aircondition) {
        this.aircondition = aircondition;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "engine='" + engine + '\'' +
                ", aircondition='" + aircondition + '\'' +
                ", tyre='" + tyre + '\'' +
                '}';
    }
}
