package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {


 By addCustomerLink = By.xpath("//button[normalize-space()='Add Customer']");
By firstnameField= By.xpath("//input[@placeholder='First Name']");
By lastNameField= By.xpath("//input[@placeholder='Last Name']");
By postCodeField =By.xpath("//input[@placeholder='Post Code']");
By addCustomerButton = By.xpath("//button[@type='submit']");



    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerLink);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstnameField,firstName);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void enterPostCode(String postCode){
        sendTextToElement(postCodeField,postCode);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
}
