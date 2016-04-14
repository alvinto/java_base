package com.yyw.thread.concurrent;

import java.util.concurrent.*;

/**
 * CyclicBarrier
 * Barrier在英语中是屏障的意思，这个同步工具会阻塞调用的线程，直到条件满足时，阻塞的线程同时被打开。
 * Created by wangshuai on 2016/4/14.
 */
public class CyclicBarrierTest {
    private static CyclicBarrier cyclicBarrier=new CyclicBarrier(8);

    private static ExecutorService service=Executors.newFixedThreadPool(50);

    public static void main(String args[]) {
        for (int i = 1; i < 9; i++) {
            service.execute(new Thread(new Runner(i, cyclicBarrier)));
        }
        service.shutdown();
    }
}


