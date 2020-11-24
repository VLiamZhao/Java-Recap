package com.ccgg.code;

public class BeanA implements Comparable<BeanA> {
    private int x;

    public BeanA() {
    }

    public BeanA(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "x=" + x +
                '}';
    }

    @Override
    public int compareTo(BeanA beanA) {
        return this.x - beanA.x;
    }
}
