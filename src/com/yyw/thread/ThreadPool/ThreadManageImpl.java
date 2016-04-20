package com.yyw.thread.ThreadPool;

import java.util.concurrent.*;

/**
 * 线程池工具类
 * Created by wangshuai on 2016/4/20.
 */
public class ThreadManageImpl implements ThreadManage{
    //最小线程数
    private static int POOL_MIN_SIZE;
    //最大线程数
    private static int POOL_MAX_SIZE;
    //线程空闲时间
    private static int TIME_IDLE;
    //线程池所使用的缓存队列
    private static int QUEUE_CAPACITY;
    //线程异常时操作
    private static RejectedExecutionHandler HANDLER;
    //队列
    private static BlockingQueue<Runnable> WORK_QUEUE;

    private ThreadPoolExecutor executor;

    static{
        POOL_MIN_SIZE = 1;
        POOL_MAX_SIZE = 15;
        TIME_IDLE = 1800;
        QUEUE_CAPACITY = 10;
        //线程异常则废弃该任务
        HANDLER = new ThreadPoolExecutor.DiscardPolicy();
        //有界队列
        WORK_QUEUE = new ArrayBlockingQueue<Runnable>(QUEUE_CAPACITY);
    }

    /**
     * 构造线程池
     * @param workQueue 队列策略
     * @param handler 异常任务处理策略
     * @param idleTime 线程空闲时间
     * @param minPool 最小线程数
     * @param maxPool 最大线程数
     */
    public ThreadManageImpl(
            BlockingQueue<Runnable> workQueue,
            RejectedExecutionHandler handler,
            int idleTime,int minPool,int maxPool){

        this.executor = new ThreadPoolExecutor(
                minPool, maxPool, idleTime,
                TimeUnit.SECONDS, /* 时间单位,秒 */ workQueue,  handler
        );
    }

    /**
     * 构造线程池
     * @param handler 异常任务处理策略
     * @param idleTime 线程空闲时间
     * @param minPool 最小线程数
     * @param maxPool 最大线程数
     */
    public ThreadManageImpl(
            RejectedExecutionHandler handler,
            int idleTime,int minPool,int maxPool){
        this(WORK_QUEUE, handler, idleTime, minPool, maxPool);
    }


    /**
     * 构造线程池
     * @param idleTime 线程空闲时间
     * @param minPool 最小线程数
     * @param maxPool 最大线程数
     */
    public ThreadManageImpl(int idleTime,int minPool,int maxPool){
        this(HANDLER, idleTime, minPool, maxPool);
    }

    /**
     * 构造线程池
     * @param minPool 最小线程数
     */
    public ThreadManageImpl(int minPool){
        this(minPool, POOL_MAX_SIZE);
    }

    /**
     * 构造线程池
     * @param minPool 最小线程数
     * @param maxPool 最大线程数
     */
    public ThreadManageImpl(int minPool,int maxPool){
        this(TIME_IDLE, minPool, maxPool);
    }

    /**
     * 构造线程池
     * @param workQueue 队列
     */
    public ThreadManageImpl(BlockingQueue<Runnable> workQueue){
        this(workQueue,HANDLER,TIME_IDLE,POOL_MIN_SIZE,POOL_MAX_SIZE);
    }

    /**
     * 构造线程池
     * @param handler 异常任务处理策略
     */
    public ThreadManageImpl(RejectedExecutionHandler handler){
        this(WORK_QUEUE,handler,TIME_IDLE,POOL_MIN_SIZE,POOL_MAX_SIZE);
    }

    /**
     * 构造线程池
     */
    public ThreadManageImpl(){
        this(POOL_MIN_SIZE, POOL_MAX_SIZE);
    }

    @Override
    public void execute(Runnable runnable) {
        executor.execute(runnable);
    }
}
