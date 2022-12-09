package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankManagerLoginPage extends Utility {

//click on Open Account Page
    By openAccount = By.xpath("//div/button[2][@ng-click='openAccount()']");
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    //click On "Add Customer" Tab
    By addCustomer = By.xpath("//button[@class='btn btn-lg tab'and @ng-click='addCust()']");
    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
    }
    //customer tab
   By clickCustomerTab = By.xpath("//button[@ng-click ='showCust()']");
    public void clickOnCostumerTab(){
        mouseHoverToElementAndClick(clickCustomerTab);
    }

        //popup display
    //	verify message "Customer added successfully"
    //	click on "ok" button on popup.
    public String popUPTextVerify(){
                   return getTextFromAlert();
             }
             public void closePopUp(){
        acceptAlert();
             }
    public BankManagerLoginPage(WebDriver driver){
        this.driver = driver;
    }

}
