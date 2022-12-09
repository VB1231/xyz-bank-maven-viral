package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Utility {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage(driver);
    By bankManagerLoginButton = By.xpath("//button[normalize-space()='Bank Manager Login']");
    public void clickOnBankManagerButton(){
        mouseHoverToElementAndClick(bankManagerLoginButton);

    }
    //HomePage Link
    By homePageLink = By.xpath("//button[contains(text(),'Home')]");
    public void clickOnHomePage(){
        clickOnElement(homePageLink);
    }
    //customer Login Tab
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLoginPage(){
        mouseHoverToElementAndClick(customerLogin);
    }
    public  HomePage(WebDriver driver){
       this.driver = driver;
    }
}
