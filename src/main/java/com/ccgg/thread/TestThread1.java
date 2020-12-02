package com.ccgg.thread;

public class TestThread1 extends Thread {
    public static void main(String[] args) {
        Thread t = new TestThread1();
        t.run();
        t.run();
        t.start();
        Thread t1 = new TestThread1();
        t1.start();
    }
    @Override
    public void run(){
        System.out.println("running " + currentThread().getName());
    }
}
