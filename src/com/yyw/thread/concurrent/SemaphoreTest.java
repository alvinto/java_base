package com.yyw.thread.concurrent;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Semaphore 用于控制特定资源在同一时间被访问的个数，类似于线程池的概念
 * 保证资源被合理的使用
 * Created by wangshuai on 2016/4/14.
 */
public class SemaphoreTest {
    private static Semaphore semaphore = new Semaphore(3);
    private static ExecutorService executorService = Executors.newFixedThreadPool(8);

    public static void main(String[] args) {
        for(int i = 0;i<9;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.printf("线程" + Thread.currentThread().getName() + "  %s 时获取资源,并调用\n", new Date().toString());
                        TimeUnit.SECONDS.sleep(3);
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
