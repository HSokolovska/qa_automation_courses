package com.course.eight;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWait {
    private WebDriver driver;

    @FindBy(xpath = "//*[@href=\"/dynamic_controls\"]")
    WebElement dynamicControls;

    @FindBy(xpath = "//*[@type= 'button' and text() ='Remove']")
    WebElement removeButton;

    @FindBy(xpath = "//*[@type= 'button' and text() ='Add']")
    WebElement addBtn;

    @FindBy(id = "checkbox")
    WebElement checkbox;


    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    /*
    Wait types:
    Implicit - global waiter for all elements
    driver.manage().timeouts().ImplicitlyWait(20,TimeUnits:seconds)

    Explicit
    Fluent
     */
    @Test
    public void seleniumTest() {
        PageFactory.initElements(driver, this);
        driver.get("https://the-internet.herokuapp.com/");

        dynamicControls.click();

        removeButton.click();

        waitUntilElementClickable(addBtn, 5).click();

        waitUntilElementVisible(checkbox, 5).click();

    }

    public WebElement waitUntilElementVisible(WebElement element, int timeoutInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilElementClickable(WebElement element, int timeoutInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSec);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
