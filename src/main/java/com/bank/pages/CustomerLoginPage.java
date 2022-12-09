package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage extends Utility {
By customerSearch =By.id("userSelect");
public void searchCustomerOnCustomerLoginPage(String s){
  selectByVisibleTextFromDropDown(customerSearch,s);
}
By clickOnCustomerLoginOnCustomerLoginPage = By.xpath("//button[contains(text(),'Login')]");
public void  clickOnCustomerLoginOnCustomerLoginPage(){
  clickOnElement(clickOnCustomerLoginOnCustomerLoginPage);
}
  public  CustomerLoginPage(WebDriver driver){
    this.driver = driver;
  }




  }
