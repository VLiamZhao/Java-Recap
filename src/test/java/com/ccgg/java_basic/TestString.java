package com.ccgg.java_basic;

import org.junit.Assert;
import org.junit.Test;

public class TestString {
    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        Assert.assertTrue(s1 == s2);
        Assert.assertSame(s1, s2);
        Assert.assertFalse(s1 == s3);
        Assert.assertEquals(s1, s3);
        Assert.assertSame(s3.intern(), s1);
    }
    private boolean inPool(String str){
        System.out.println(str.intern());
        return str.intern() == str;
    }

    @Test
    public void test2(){
        String s1 = "ab";
        String s2 = s1 + "cd";
        String s3 = "ab" + "cd";
        Assert.assertEquals(s2, s3);
        Assert.assertNotSame(s2, s3);
        Assert.assertTrue(inPool(s3));
        Assert.assertFalse(inPool(s2));
    }
    @Test
    public void test3(){
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        Assert.assertFalse(sb1.equals(sb2));
    }
}
