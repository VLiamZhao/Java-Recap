package com.ccgg.java8;

import java.util.*;

public class TestLambda {
  public static void main(String[] args) {
    TestInterface tif = new TestInterface() {
        @Override
        public void test() {
            System.out.println("tif");
        }
    };
    tif.test();

    TestInterface tif1 = () -> System.out.println("tif1");

    tif1.test();
    tif1.test2();
    TestInterface.test3();

    List<Integer> list = Arrays.asList(4, 2, 3);
    Collections.sort(list, (a, b) -> b - a);
    System.out.println(list);

      Map<String, Integer> map = new HashMap<>();
      map.put("a", 1);
      map.put("b", 1);
      map.forEach((k, v) -> System.out.println(k + ", " + v));
  }
}
