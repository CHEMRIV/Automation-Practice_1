package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WomenCategoryPage extends Utility {

    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;

    public String verifyWomenText(){
        return getTextFromElement(womenText);

    }
}
