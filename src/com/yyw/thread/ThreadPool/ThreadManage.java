package com.yyw.thread.ThreadPool;

/**
 * Created by wangshuai on 2016/4/20.
 */
public interface ThreadManage {
    /**
     * 执行线程
     * @param runnable
     */
    void execute(Runnable runnable);
}
