package com.ccgg.thread;

public class DummyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is invoked!");
    }
}
