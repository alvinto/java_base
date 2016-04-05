package com.yyw.thread;

/**
 * 简单的线程
 * 创建任意数量的线程，每个线程都有一个线程名（一个唯一的id，静态变量产生）
 * Created by wangshuai on 2016/3/15.
 */
public class SimpleThread extends Thread{
    private int countDown = 5;
    private int threadNumber;
    private static int threadCount = 0;

    public SimpleThread() {
        this.threadNumber = ++threadCount;
        System.out.println("making "+threadNumber);
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Thread "+threadNumber +"("+countDown+")");
            if(--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i<5;i++){
            new SimpleThread().start();
        }
        System.out.println("all thread is started");
    }
}
