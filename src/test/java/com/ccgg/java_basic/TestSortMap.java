package com.ccgg.java_basic;

import org.junit.Test;

import java.util.*;

public class TestSortMap {

    @Test
    public void testSortHashMapWithStringString(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "bob");
        map.put("e", "alex");
        map.put("c", "george");
        map.put("d", "zack");
        map.put("q", "amy");
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
    Collections.sort(
        list,
        new Comparator<Map.Entry<String, String>>() {
          @Override
          public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
            return o1.getValue().compareTo(o2.getValue());
          }
        });
        map = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> e : list){
            map.put(e.getKey(), e.getValue());
        }
        System.out.println(Arrays.asList(map));
    }

    @Test
    public void testTreeMapReverse(){
        Map<String, String> map = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        map.put("a", "bob");
        map.put("e", "alex");
        map.put("c", "george");
        map.put("d", "zack");
        map.put("q", "amy");
        System.out.println(Arrays.asList(map));
    }
}
