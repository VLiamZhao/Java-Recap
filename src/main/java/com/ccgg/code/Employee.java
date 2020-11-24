package com.ccgg.code;

public class Employee implements Cloneable {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{
        return (Employee)super.clone();
    }
}
