package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends Utility {


    @FindBy(id = "customer_firstname")
    WebElement customerFirstname;
    @FindBy(id = "customer_lastname")
    WebElement customerLastname;
    @FindBy(id = "passwd")
    WebElement customerPassword;
    @FindBy(id = "address1")
    WebElement address;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement selectState;
    @FindBy(id = "postcode")
    WebElement zipCode;
    @FindBy(id = "phone_mobile")
    WebElement mobileNumber;
    @FindBy(id = "submitAccount")
    WebElement registerAccount;


    public void addCustomerFirstname(String fstName) {
        sendTextToElement(customerFirstname, fstName);
    }

    public void addCustomerLastname(String lstName) {
        sendTextToElement(customerLastname, lstName);
    }

    public void addCustomerPassword(String password) {
        sendTextToElement(customerPassword, password);
    }

    public void addAddress(String address1) {
        sendTextToElement(address, address1);
    }
    public void addCity(String city1) {
        sendTextToElement(city, city1);
    }
    public void addState(String state1){
        sendTextToElement(selectState,state1);
    }
    public void addCustomerZipCode(String zip_Code) {
        sendTextToElement(zipCode, zip_Code);
    }
    public void addCustomerMobileNumber(String number) {
        sendTextToElement(mobileNumber,number);
    }
    public void setRegisterAccount(){
        clickOnElement(registerAccount);
    }

}
