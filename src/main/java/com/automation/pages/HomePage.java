package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIn;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement women;


    public void clickOnSignIn() {
        clickOnElement(signIn);
    }

    public String verifySignIn() {
        return getTextFromElement(signIn);

    }
    public void clickOnWomenButton(){
        clickOnElement(women);
    }

}
