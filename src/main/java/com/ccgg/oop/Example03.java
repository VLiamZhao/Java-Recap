package com.ccgg.oop;

public class Example03 {
    private static class Base{
        public void foo1(){
            System.out.println("Foo1 in Base");
        }
        public static void foo2(){
            System.out.println("Foo2 in Base");
        }
    }

    private static class Sub extends Base{
        @Override
        public void foo1(){
            System.out.println("Foo1 in Base");
        }
        public static void foo2(){


            System.out.println("Foo2 in Sub");
        }
    }

    public static void main(String[] args){
        Base.foo2();
        new Base().foo1();
    }
}
