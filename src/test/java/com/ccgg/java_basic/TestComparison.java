package com.ccgg.java_basic;

import com.ccgg.code.BeanA;
import com.ccgg.code.BeanB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparison {
    public static void printList(List list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println("");
    }
  public static void main(String[] args) {
    //
      List<BeanA> list = new ArrayList<>();
      list.add(new BeanA(3));
      list.add(new BeanA(5));
      list.add(new BeanA(1));
      printList(list);
      Collections.sort(list);
      printList(list);
      List<BeanB> list1 = new ArrayList<>();
      list1.add(new BeanB("X"));
      list1.add(new BeanB("B"));
      list1.add(new BeanB("C"));
      printList(list1);
      Collections.sort(list1, new Comparator<BeanB>() {
          @Override
          public int compare(BeanB beanB, BeanB t1) {
              return beanB.getName().compareTo(t1.getName());
          }
      });
      printList(list1);
  }
}
