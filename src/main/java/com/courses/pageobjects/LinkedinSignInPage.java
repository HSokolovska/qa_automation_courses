package com.courses.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinSignInPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='email-address']")
    private WebElement emailFld;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordFld;

    @FindBy(id = "join-form-submit")
    private WebElement agreeAndJoinBtn;


    public LinkedinSignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void enterEmail(String email) {
        emailFld.sendKeys(email);
    }

    public void enterPass(String pass) {
        passwordFld.sendKeys(pass);
    }

    public void pressAgreeAndJoin() {
        agreeAndJoinBtn.click();
    }

    public void getPage() {
        driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
    }
}

