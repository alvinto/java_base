package com.yyw.thread.concurrent;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangshuai on 2016/4/14.
 */
// 运动员类
public class Runner implements Runnable {
    private int number;
    private CyclicBarrier cyclicBarrier;

    public Runner(int number, CyclicBarrier cyclicBarrier) {
        this.number = number;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            int timer = new Random().nextInt(10);
            TimeUnit.SECONDS.sleep(timer);
            System.out.printf("%d号选手准备完毕,准备时间%d\n", number, timer);
            cyclicBarrier.await();
            System.out.printf("%d号选手于%s时起跑!\n", number, new Date().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
