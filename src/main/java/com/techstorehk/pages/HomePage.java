package com.techstorehk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.techstorehk.utils.CommonMethod.waitAndClick;
import static com.techstorehk.utils.DriverManager.getWebDriver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//div[@class='nav-center container']//img[@src='./images/logo.png']")
    private WebElement logoImage;

    @FindBy(css = ".popup-close")
    private WebElement closePopUpBtn;

    public void verifyHomePage() {
        try{
            closePopUpBtn.isDisplayed();
            waitAndClick(closePopUpBtn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertTrue(logoImage.isDisplayed(), "Logo Image is not displayed !!!");
    }
}
