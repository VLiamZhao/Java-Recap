package com.ccgg.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestProducerConsumer {
  public static void main(String[] args) {
      BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
      Thread producer = new Thread(new Producer(queue));
      producer.start();
      Thread consumer1 = new Thread(new Consumer(queue));
      consumer1.start();
      Thread consumer2 = new Thread(new Consumer(queue));
      consumer2.start();
      Thread consumer3 = new Thread(new Consumer(queue));
      consumer3.start();
  }
}
