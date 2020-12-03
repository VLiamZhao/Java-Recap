package com.ccgg.java_basic;

import com.ccgg.code.WrappedString;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    @Test
    public void test(){
        Set<Object> set = new HashSet<>();
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new WrappedString("bcd"));
        set.add(new WrappedString("bcd"));
        set.add(1);
        set.add(1);
        System.out.println(set.size());
    }
}
