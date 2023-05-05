package com.bank.testsuite;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.Homepage;
import com.bank.pages.OpenAccountPage;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    Homepage homepage = new Homepage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homepage.clickOnBankManagerLoginTab();
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("prime543");
        addCustomerPage.enterLastName("Tester");
        addCustomerPage.enterPostCode("WD23 6LF");
        addCustomerPage.clickOnAddCustomerButton();
        String textFromAlert = getTextFromAlert();
        System.out.println(textFromAlert);
        Assert.assertTrue(textFromAlert.contains("Customer added successfully"));
        acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homepage.clickOnBankManagerLoginTab();
        openAccountPage.clickOnOpenAccountTab();
        openAccountPage.searchCustomer();
        openAccountPage.selectCurrencyPound();
        openAccountPage.clickOnProcessButton();
        String textFromPopup = getTextFromAlert();
        System.out.println(textFromPopup);
        Assert.assertTrue(getTextFromAlert().contains("Account created successfully"));
        acceptAlert();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {

        customerLoginPage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerThatYouCreated();
        customerLoginPage.clickOnLoginButton();
        Assert.assertTrue(customerLoginPage.isLogoutTabDisplayed());
        customerLoginPage.clickOnLogout();
        Assert.assertTrue(customerLoginPage.getYourNameText().contains("Your Name"));

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        customerLoginPage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerThatYouCreated();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.clickOnDepositTab();
        customerLoginPage.enterAmount100();
        customerLoginPage.clickOnDepositButton();
        Assert.assertEquals(customerLoginPage.getDepositSuccessfulMessage(), "Deposit Successful");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

        customerLoginPage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerThatYouCreated();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.clickOnWithDrawlTab();
        customerLoginPage.enterAmount50();
        customerLoginPage.clickOnWithDrawButton();
       // Assert.assertEquals(customerLoginPage.getTransactionSuccessMessage(), "Transaction Successful");


    }


}
