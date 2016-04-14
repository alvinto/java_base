package com.yyw.taskscheduling;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 为解决Timer的缺陷，java 5推出了ScheduledExecutor
 *其设计思想是每一个被调度的任务都由线程池中一个线程去执行，任务是并发的，相互之间不会干扰
 * 需要注意的是只有执行时间到了，ScheduledExecutor才会真正启动一个线程，其余时间都是在轮询任务的状态。
 * Created by wangshuai on 2016/4/14.
 */
public class ScheduledExecutorTest implements Runnable {
    private String jobName;

    public ScheduledExecutorTest(String name){
        super();
        jobName = name;
    }

    @Override
    public void run() {
        System.out.printf("执行%s",jobName);
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.scheduleAtFixedRate(new ScheduledExecutorTest("job1"),1,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ScheduledExecutorTest("job2"),2,2,TimeUnit.SECONDS);
    }
}
