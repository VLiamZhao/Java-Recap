package com.ccgg.oop;

public class Example01 {
    private static class Base{
        public Base(){
            System.out.println("Base");
        }
        public Base(String str){
            System.out.println(str + "Base");
        }
    }

    private static class Sub extends Base{
        public Sub(){
            System.out.println("Sub");
        }
        public Sub(String str){
            // super(str);
            super(); //
            System.out.println(str + "Sub");
        }
    }

    public static void main(String[] args){
        new Sub("Bob");
    }
}
