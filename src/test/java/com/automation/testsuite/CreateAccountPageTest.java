package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
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
    public void verifyThatUserShouldCreateAccountSuccessfully(){
      homePage.clickOnSignIn();
      signInPage.createEmail("fkamzx123@gmail.com");
      signInPage.setCreateAnAccount();
      createAccountPage.addCustomerFirstname("ghgfdfdfh");
      createAccountPage.addCustomerLastname("dsfdf");
      createAccountPage.addAddress("bfbfefdb");
      createAccountPage.addCity("london");
      createAccountPage.addState("California");
      createAccountPage.addCustomerZipCode("45862");
      createAccountPage.addCustomerMobileNumber("7778625964");
      createAccountPage.setRegisterAccount();
    }

}

