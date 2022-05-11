package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    CreateAccountPage createAccountPage;
    ProductPage productPage;
    SignInPage signInPage;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod
    public void inIT() {
        homePage = new HomePage();
        createAccountPage = new CreateAccountPage();
        productPage = new ProductPage();
        signInPage = new SignInPage();
        womenCategoryPage = new WomenCategoryPage();
    }

    @Test
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        homePage.clickOnWomenButton();
        String expectedMsg = "WOMEN";
        String actualMsg = womenCategoryPage.verifyWomenText();
        Assert.assertEquals(expectedMsg, actualMsg, "No Match Found");
    }
    @Test
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour){

    }


}
