package com.ccgg.thread;

public class Deadlock {
    private static class Friend{
        String name;
        private Friend(String name){
            this.name = name;
        }
        public synchronized void bow(Friend another) throws InterruptedException {
            System.out.println(name + " bows back to " + another.name);
            Thread.sleep(1000);
            another.bowBack(this);
        }
        public synchronized void bowBack(Friend another){
            System.out.println(name + " bow back to " + another.name);
        }
    }

  public static void main(String[] args) throws InterruptedException{
        Friend alice = new Friend("Alice");
        Friend bob = new Friend("Bob");
        Thread r1 = new Thread(){
            @Override
            public void run(){
                System.out.println("a");
                try {
                    alice.bow(bob);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread r2 = new Thread(){
            @Override
            public void run(){
                System.out.println("b");
                try {
                    bob.bow(alice);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        r1.start();
        r2.start();
        r1.join();
        r2.join();
    System.out.println("end");
  }
}
