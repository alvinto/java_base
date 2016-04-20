package com.yyw.thread.ThreadPool;

import java.text.MessageFormat;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;

/**
 * 多线程任务调度工具类
 * @author houbinfei
 *
 * @param <T>
 */
public abstract class MoreThreadJobManager<T> {
	/**
	 * 声明线程管理工具
	 */
	private ThreadManage threadManager = new ThreadManageImpl(new SynchronousQueue<Runnable>());
	
	
	/**
	 * 单个线程处理订单的最大数
	 */
	private static final int MaxGroup = 200;
	
	/**
     * 计算线程数
     * @param count 总数
     * @return 线程数
	 */
	private int getThreadCount(int count){
		return count % MaxGroup == 0 ? count / MaxGroup : count / MaxGroup + 1;
	}
	/**
	 * 任务调度启动方法
	 */
	public final void process(){
		final String templateHead = MessageFormat.format("【任务调度】{0}：", taskDescribe());
		long begin = System.currentTimeMillis();
		//getLogger().error(false, String.valueOf(begin), MessageFormat.format("{0}begin ...", templateHead));
		
		try {
			int count = 0;
			List<T> list = getData();
			// 获取线程数
			int threadCount = getThreadCount(count = list.size());
			/**
			 * 计数器
			 */
			CountDownLatch lotch = new CountDownLatch(threadCount);
			List<T>  temp = null;
			for (int i = 0; i < threadCount; i++) {
				if(i == threadCount -1){
					/** 验证 索引 i 是否为循环的 尾索引 */
					temp = list.subList(i * MaxGroup, count);
				}else{
					temp = list.subList(i * MaxGroup, (i+1) * MaxGroup);
				}
				threadManager.execute(dispose(lotch,temp));
			}
			/**
			 * 作用：为了统计总线程消耗时间
             * 采用多线程计数器
			 */
			try {
				lotch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//getLogger().error(true, MessageFormat.format("{0}共开启线程数<{1}>, 共处理 <{2}> 条数据...", new Object[]{
//					templateHead,threadCount,count
//			}));
		} catch (Exception e) {
			//getLogger().debug(true, String.valueOf(begin), MessageFormat.format("{0}异常信息->{1}", templateHead,e.getMessage()));
		}finally {
//			getLogger().error(true, String.valueOf(begin), MessageFormat.format("{0}end,总线程耗时-> {1}(ms)", new Object[]{
//					templateHead,System.currentTimeMillis()-begin
//			}));
		}
	}
	
	/**
	 * 单线程处理程序
     * @param lotch 计数器
     * @param list 处理数据
	 * @return
	 */
	protected abstract Runnable dispose(CountDownLatch lotch,List<T> list);
	
	/**
	 * 获取操作数据
	 * @return
	 */
	protected abstract List<T> getData();
	
	/**
	 * 获取日志目标
	 * @return
	 */
//	protected abstract YaoLogger getLogger();
	
	
	/**
	 * 
	 * @return
	 */
	protected abstract String taskDescribe();
}
