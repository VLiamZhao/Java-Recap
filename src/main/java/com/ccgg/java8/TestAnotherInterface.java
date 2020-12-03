package com.ccgg.java8;

public interface TestAnotherInterface {
    public abstract void test();

    default void test2(){
        System.out.println("another test2");
    }
}
