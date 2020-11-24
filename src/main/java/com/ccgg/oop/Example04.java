package com.ccgg.oop;

public class Example04 {
    private static class Base{
        int x = 5;
        public Base(){
            this.foo();
        }
        public void foo(){
            System.out.println(x + " in Base");
        }
    }

    private static class Sub extends Base {
        int x = 3;  // non-static is loaded after class initiation
        public Sub(){
            super(); // x is not assigned value, foo is overriden.
            foo();
        }
        public void foo(){
            System.out.println(x + " in Sub");
        }
    }

    public static void main(String[] args){
        new Sub();
    }
}
