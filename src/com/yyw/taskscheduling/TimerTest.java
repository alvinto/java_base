package com.yyw.taskscheduling;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用Timer实现任务调度的核心类是Timer和TimerTask，
 * 其中Timer负责设置TimerTask的起始和间隔时间，使用者这需要继承TimerTask，实现自己的 run 方法，然后将其丢给 Timer 去执行即可
 *
 * 优点：简单易用
 * 缺点：由于所有任务都是由同一个线程来调度，因此所有任务是串行的，同一时间只能执行一个任务，前一个任务的延迟或异常都会影响之后的任务
 * Created by wangshuai on 2016/4/14.
 */
public class TimerTest extends TimerTask {
    private String taskName;
    public TimerTest(String taskName){
        super();
        this.taskName = taskName;
    }
    @Override
    public void run() {
        System.out.printf("执行%s",taskName);
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        long delay1 = 1 * 1000;
        long period1 = 1000;
        timer.schedule(new TimerTest("job1"),delay1,period1);
        long delay2 = 2 * 1000;
        long period2 = 2000;
        timer.schedule(new TimerTest("job2"),delay2,period2);
    }
}
