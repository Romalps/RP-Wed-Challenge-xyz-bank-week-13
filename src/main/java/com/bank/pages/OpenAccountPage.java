package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

By openAccountTab =By.xpath("//button[normalize-space()='Open Account']");
By searchCustomerField = By.xpath("//select[@name='userSelect']");
By currencyLink=  By.xpath("//select[@name='currency']");
By processButton = By.xpath("//button[normalize-space()='Process']");


    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountTab);
    }
    public void searchCustomer(){
        selectByVisibleTextFromDropDown(searchCustomerField,"Harry Potter ");

    }
public void selectCurrencyPound(){
        selectByVisibleTextFromDropDown(currencyLink,"Pound");
}
public void clickOnProcessButton(){
        clickOnElement(processButton);
}
}
