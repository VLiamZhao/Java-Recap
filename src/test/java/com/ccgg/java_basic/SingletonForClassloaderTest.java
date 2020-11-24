package com.ccgg.java_basic;

public class SingletonForClassloaderTest {
    private static SingletonForClassloaderTest instance = new SingletonForClassloaderTest();
    private static int x = 100;
    private static int y;

    private SingletonForClassloaderTest(){
    System.out.println(x);
    System.out.println(y);
    x++;
    y++;
    System.out.println(x);
    System.out.println(y);
    }
    public static SingletonForClassloaderTest getInstance(){
        return instance;
    }

  public static void main(String[] args) {
    System.out.println("x: " + x);
    System.out.println("y: " + y);
    SingletonForClassloaderTest s = SingletonForClassloaderTest.getInstance();
    System.out.println(s.x);
    System.out.println(s.y);
  }
}
