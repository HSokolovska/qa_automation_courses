package com.course.nine;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MvnTests {
    @Parameters({"first-name"})

    @Test
    public void testOne(String FirstName) {
        Long threadId = Thread.currentThread().getId();
        System.out.println("First Test " + threadId);
        Assert.assertEquals(2,2);

    }

    @Test
    public void testTwo() {
        Long threadId = Thread.currentThread().getId();
        System.out.println("Second Test "+ threadId);
        Assert.assertEquals(5,5);

    }

    @Test
    public void testThree() {
        Long threadId = Thread.currentThread().getId();
        System.out.println("Third Test "+ threadId);
        Assert.assertEquals(7,8);

    }
}
