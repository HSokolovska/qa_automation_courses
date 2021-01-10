package com.course.seven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsTest {
    private WebDriver driver;

/*
Locators:
Id => p1
Name => p2
CSS => 3
Xpath =>3
LinkText
 */


    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void seleniumTest() {
        driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        WebElement emailTxtFld = driver.findElement(By.id("email-address"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement agreeJoinBtn = driver.findElement(By.xpath("//*[text()= 'Agree & Join']"));
        WebElement userAgreement = driver.findElement(By.linkText("User Agreement"));
        emailTxtFld.sendKeys("test@test.com");
        password.sendKeys("pass");
        agreeJoinBtn.click();
        userAgreement.click();
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        if(driver != null) {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
