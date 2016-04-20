package com.yyw.thread;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程可见性
 * 过期数据
 * Created by wangshuai on 2016/4/5.
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReadThread extends Thread{
        @Override
        public void run() {
            while(!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        new ReadThread().start();
        number = 1;
        ready = true;
        ThreadPoolExecutor
    }

}
