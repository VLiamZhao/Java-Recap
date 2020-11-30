package com.ccgg.java_basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {
    private void addNullValue(Map<String, String> map){
        map.put("A", null);
        map.put("C", null);
        map.put("B", "100");
    }

    @Test
    public void test1(){
        Map<String, String> map = new HashMap<>();
        addNullValue(map);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals(null, map.get("A"));
    }

    @Test
    public void test2(){
        Map<String, String> map = new HashMap<>();
        addNullValue(map);
    }

    @Test(expected = NullPointerException.class)
    public void test3(){
        Map<String, String> map = new ConcurrentHashMap<>();
        addNullValue(map);
    }

    private void addNullKey(Map<String, String> map){
        map.put(null, "A");
        map.put("B", "XYZ");
    }

    @Test
    public void test4(){
        Map<String, String> map = new HashMap<>();
        addNullKey(map);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("A", map.get(null));
    }

    @Test(expected = NullPointerException.class)
    public void test5(){
        Map<String, String> map = new Hashtable<>();
        addNullKey(map);
    }

    @Test(expected = NullPointerException.class)
    public void test6(){
        Map<String, String> map = new ConcurrentHashMap<>();
        addNullKey(map);
    }

    @Test(expected = ConcurrentModificationException.class)
    public void test7(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        map.put("D", 4);
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test(expected = ConcurrentModificationException.class)
    public void test8(){
        Map<String, Integer> map = new Hashtable<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        map.put("D", 4);
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    public void test9(){
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        map.put("D", 4);
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
