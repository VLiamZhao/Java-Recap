package com.ccgg.java_basic;

import com.ccgg.code.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    private Person person;
    @Before
    public void setUp() throws Exception{
        person = new Person("Alice");
    }

    @Test
    public void testName(){
        Assert.assertEquals("Alice", person.getName());
    }
    @Test
    public void testAddPrefix(){
        Person person2 = person.addPrefix("Ms");
        Assert.assertEquals("Ms Alice", person2.getName());
        Assert.assertNotSame(person2, person);
    }
}
