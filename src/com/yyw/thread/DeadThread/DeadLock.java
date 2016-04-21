package com.yyw.thread.DeadThread;

/**
 * o1,o2为竞态资源
 * 线程1拿到o1，o2
 * 线程2拿到o2,o1
 * Created by wangshuai on 2016/4/18.
 */
public class DeadLock implements Runnable {
    private int flag;

    public DeadLock(int flag) {
        this.flag = flag;
    }
    public DeadLock(){}


    private static Object o1 = new Object();
    private static Object o2 = new Object();
    @Override
    public void run() {
        if(flag == 1){
            synchronized (o1){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(o2){
                    System.out.println("获取o2，执行");
                }
            }

        }else{
            synchronized (o2){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(o1){
                    System.out.println("获取o1，执行");
                }
            }

        }
    }

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(1);
        DeadLock d2 = new DeadLock(2);

        new Thread(d1).start();
        new Thread(d2).start();
    }
}
