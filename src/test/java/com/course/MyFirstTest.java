package com.course;

import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirstTest {

    @BeforeClass
    public void setupClass (){
        System.out.println("Setup class");

    }

    @BeforeTest
    public void setupTest(){
        System.out.println("Setup Test");

    }

    @BeforeMethod
    public void setupMethod (){
        System.out.println("Setup Method");

    }

    @BeforeSuite
    public void setupSuite(){
        System.out.println("Setup Suite");

    }

    @Test(priority = 0, enabled = true)
    public void basicTest() {
        System.out.println("First executed");
        Assert.assertEquals(2,2);

    }

    @Test(priority = 1, enabled = true)
    public void basicTest2() {
        System.out.println("Second executed");
        Assert.assertEquals(2,5);

    }

    @AfterClass
    public void teardownСlass (){
        System.out.println("Teardown class");

    }

    @AfterTest
    public void teardownTest(){
        System.out.println("Teardown Test");

    }

    @AfterMethod
    public void teardownMethod (){
        System.out.println("Teardown Method");

    }

    @AfterSuite
    public void teardownSuite(){
        System.out.println("Teardown Suite");

    }
}