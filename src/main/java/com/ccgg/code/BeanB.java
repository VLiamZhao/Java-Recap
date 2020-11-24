package com.ccgg.code;

public class BeanB {
    private String name;

    public BeanB() {
    }

    public BeanB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                '}';
    }
}
