package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage extends Utility {

    By customerLoginTab = By.xpath("//button[normalize-space()='Customer Login']");
    By searchCustomer = By.xpath("//select[@name='userSelect']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By logoutTab = By.xpath("//button[normalize-space()='Logout']");
    By yourNameText = By.xpath("//label[normalize-space()='Your Name :']");
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amount100 = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@type='submit']");
    By depositSuccessMessage = By.xpath("//span[@class='error ng-binding']");
    By withDrawlTab = By.xpath("//button[normalize-space()='Withdrawl']");
    By amount50 = By.xpath("//input[@placeholder='amount']");
    By withDrawButton = By.xpath("//button[normalize-space()='Withdraw']");
    By transactionSuccessMessage = By.xpath("//span[@class='error ng-binding']");

    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
    }

    public void searchCustomerThatYouCreated() {
        selectByVisibleTextFromDropDown(searchCustomer, "Harry Potter");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public boolean isLogoutTabDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        WebElement logout = driver.findElement(logoutTab);
        return logout.isDisplayed();
    }

    public void clickOnLogout() {

        clickOnElement(logoutTab);
    }

    public String getYourNameText() {
        return getTextFromElement(yourNameText);
    }

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void enterAmount100() {
        sendTextToElement(amount100, "100");
    }

    public void clickOnDepositButton() {
        clickOnElement(depositButton);
    }

    public String getDepositSuccessfulMessage() {
        return getTextFromElement(depositSuccessMessage);
    }

    public void clickOnWithDrawlTab() {
        clickOnElement(withDrawlTab);
    }

    public void enterAmount50() {
        sendTextToElement(amount50, "50");
    }

    public void clickOnWithDrawButton() {
        clickOnElement(withDrawButton);
    }

    public String getTransactionSuccessMessage() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(transactionSuccessMessage);
    }
}
