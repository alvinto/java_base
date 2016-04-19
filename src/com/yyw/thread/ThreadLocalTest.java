package com.yyw.thread;

/**
 * ThreadLocal 为每个线程提供不同的变量拷贝，各个线程之间互不影响
 * ThreadLocalMap
 * Created by wangshuai on 2016/4/19.
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int getNextNum(){
        seqNum.set(seqNum.get()+1);
        return seqNum.get();
    }

    public static void main(String[] args) {
        ThreadLocalTest tt = new ThreadLocalTest();
        TestClient tc1 = new TestClient(tt);
        TestClient tc2 = new TestClient(tt);
        TestClient tc3 = new TestClient(tt);

        tc1.start();
        tc2.start();
        tc3.start();
    }

    private static class TestClient extends Thread{
        private ThreadLocalTest sn;
        public TestClient(ThreadLocalTest sn){
            this.sn = sn;
        }
        @Override
        public void run() {
            for(int i=0;i<3;i++){
                System.out.printf("线程%s-->sn[%s]\n",Thread.currentThread().getName(),sn.getNextNum());
            }
        }
    }
}
