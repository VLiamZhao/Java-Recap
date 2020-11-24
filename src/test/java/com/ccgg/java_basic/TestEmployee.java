package com.ccgg.java_basic;

import com.ccgg.code.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEmployee {
    private Employee emp;
    @Before
    public void setUp() throws Exception{
        emp = new Employee("Bob");
    }

    @Test
    public void test() throws CloneNotSupportedException{
        Employee emp2 = emp.clone();
        Assert.assertNotSame(emp2, emp);
        Assert.assertEquals(emp2.getName(), emp.getName());
    }
}
