package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement verifyMsg;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "passwd")
    WebElement passwordField;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signIn;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]")
    WebElement errorMsg;

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutButton;

    @FindBy(id = "email_create")
    WebElement createEmail;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAnAccount;


    public String verifyMsg() {
        return getTextFromElement(verifyMsg);
    }

    public void emailField(String email) {
        Reporter.log("Enter email " + email + " to email field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void passwordField(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignIn() {
        Reporter.log("Clicking on Login Button " + signIn.toString());
        clickOnElement(signIn);
    }

    public String errorMsg() {
        return getTextFromElement(errorMsg);
    }

    public void loginToApplication(String username, String password) {
        emailField(username);
        passwordField(password);
        clickOnSignIn();

    }
    public String verifySignOutButton(){
        return getTextFromElement(signOutButton);
    }
    public void signOut(){
        clickOnElement(signOutButton);
    }
    public void createEmail(String email1){
        sendTextToElement(createEmail,email1);

    }
    public void setCreateAnAccount(){
        clickOnElement(createAnAccount);
    }
}
