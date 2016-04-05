package com.yyw.thread.code1200;

/**
 * 简单的线程
 * Created by wangshuai on 2016/3/16.
 */
public class simple1 {
    public static void main(String[] args) {
        for(int i =0;i<5;i++){
            System.out.println("java编程思想"+i);
        }
        for(int i =0;i<5;i++){
            System.out.println("core java"+i);
        }

        for(int i =0;i<5;i++){
            new Thread(){
                public void run(){
                    System.out.println("java编程思想");
                }
            }.start();
        }
        for(int i =0;i<5;i++){
            new Thread(){
                public void run(){
                    System.out.println("core java");
                }
            }.start();

        }
    }
}
