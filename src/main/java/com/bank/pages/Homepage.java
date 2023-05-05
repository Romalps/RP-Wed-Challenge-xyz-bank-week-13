package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {


    By bankManagerLoginLink = By.xpath("//button[normalize-space()='Bank Manager Login']");





   public void clickOnBankManagerLoginTab(){
       clickOnElement(bankManagerLoginLink);
   }

}
