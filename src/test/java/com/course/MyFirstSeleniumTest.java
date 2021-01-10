package com.course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class MyFirstSeleniumTest {
    private WebDriver driver;


    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void seleniumTest() {
        driver.get("https://google.com.ua");
    }
    @AfterMethod
    public void teardown(){
        if(driver != null) {
            driver.quit();
        }
    }
}

