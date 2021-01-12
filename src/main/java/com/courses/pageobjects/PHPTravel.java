package com.courses.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravel {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"Primary_Navbar-Store\"]")
    private WebElement StoreDropdownList;

    @FindBy(xpath = "//*[@id=\"Primary_Navbar-Store-Mobile\"]")
    private WebElement MobileFromDropDownList;

    @FindBy(xpath = "//*[@id=\"pid41\"]")
    private WebElement HybridCheckbox;

    @FindBy(xpath = "//*[@type =\"submit\" and @class = \"btn btn-primary btn-lg\"]")
    private WebElement ContinueBtn;

    @FindBy(xpath = "//*[@href =\"cart.php\" and @class = \"btn btn-default\"]")
    private WebElement ContinueShoppingBtn;

    public WebElement getMobileFromDropDownList() {
        return this.MobileFromDropDownList;
    }

    public PHPTravel(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectStore() {
        StoreDropdownList.click();
    }

    public void selectMobile() {
        MobileFromDropDownList.click();
    }

    public void selectHybridCheckbox() {
        HybridCheckbox.click();
    }

    public void pressContinueBtn() {
        ContinueBtn.click();
    }

    public void pressContinueShopping() {
        ContinueShoppingBtn.click();
    }

    public void getPage() {
        driver.get("https://phptravels.org/clientarea.php");
    }

    public WebElement waitUntilElementVisible(WebElement element, int timeoutInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
