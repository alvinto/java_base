package com.yyw.thread.concurrent;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 这样一个功能需要Thread1、Thread2、Thread3、Thread4四条线程分别统计C、D、E、F四个盘的大小，所有线程都统计完毕交给主线程去做汇总
 * 使用CountDownLatch工具类
 * Created by wangshuai on 2016/4/14.
 */
public class CountDowmLatchTest {
    private static CountDownLatch countDownLatch = new CountDownLatch(4);

    private static ExecutorService service = Executors.newFixedThreadPool(6);

    public static void main(String[] args) {
        for (int i = 0;i<4;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    int timer = new Random().nextInt(5);
                    try {
                        TimeUnit.SECONDS.sleep(timer);
                        System.out.printf("%s 时完成磁盘的统计任务，耗时%d秒。\n", new Date().toString(), timer);
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        try {
            //主线程一直等待，直到countDownLatch为0时，唤醒
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s时全部任务都完成,执行合并计算.\n", new Date().toString());
        service.shutdown();
    }
}
