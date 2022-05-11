package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

    HomePage homePage;
    CreateAccountPage createAccountPage;
    SignInPage signInPage;


    @BeforeMethod
    public void inIT() {
        homePage = new HomePage();
        createAccountPage = new CreateAccountPage();
        signInPage = new SignInPage();

    }

    @Test
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.clickOnSignIn();
        String expectedResult="AUTHENTICATION";
        String actualResult=signInPage.verifyMsg();
        Assert.assertEquals(actualResult,expectedResult,"No Match Found");

    }
    @Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                              String message){
        homePage.clickOnSignIn();
        signInPage.loginToApplication(username,password);
        String actualMessage = signInPage.errorMsg();
        Assert.assertEquals( actualMessage, message);

    }
    @Test
    public void  verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnSignIn();
        signInPage.emailField("reeva123@gmail.com");
        signInPage.passwordField("654321");
        signInPage.clickOnSignIn();
        String expectedMsg="Sign out";
        String actualMsg=signInPage.verifySignOutButton();
        Assert.assertEquals(expectedMsg,actualMsg,"user is not able to do sign");
    }
    @Test
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignIn();
        signInPage.emailField("reeva123@gmail.com");
        signInPage.passwordField("654321");
        signInPage.clickOnSignIn();
        signInPage.signOut();
        String expectedMsg="Sign in";
        String actualMsg=homePage.verifySignIn();
        Assert.assertEquals(expectedMsg,actualMsg,"User is not in signIn page");


    }



}
