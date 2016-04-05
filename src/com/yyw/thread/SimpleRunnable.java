package com.yyw.thread;

/**
 * Created by wangshuai on 2016/3/15.
 */
public class SimpleRunnable implements Runnable{
    private int countDown = 5;
    private int threadNumber;
    private static int threadCount = 0;

    public SimpleRunnable() {
        threadNumber = ++threadCount;
        System.out.println("making " + threadNumber);
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Thread "+threadNumber +"("+countDown+")");
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            new Thread(new SimpleRunnable()).start();
        }
        System.out.println("all thread is started");
    }
}
