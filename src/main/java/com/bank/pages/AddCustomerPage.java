package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage extends Utility {

    //enter FirstName
  //  By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    By enterFirstName = By.xpath("//form/div[1]/input");
    public void enterAddFirstName(String firstName1){
        sendTextToElement(enterFirstName,firstName1);
           }
    //	enter LastName
    By enterLastName = By.xpath("//form/div[2]/input");
    public void enterAddLastName(String lastName1){
        sendTextToElement(enterLastName,lastName1);
    }
    //	enter PostCode
    By enterPostCode = By.xpath("//form/div[3]/input");
    public void enterPostCode(String postCode1){
        sendTextToElement(enterPostCode,postCode1);

    }
    //	click On "Add Customer" Button
  //  By clickOnAddCustomer=By.xpath("//button[@type='submit']");
    By clickOnAddCustomer=By.xpath("//form/button");
    public void clickAfterAddingDetail(){
        clickOnElement(clickOnAddCustomer);
    }
    public AddCustomerPage(WebDriver driver){
        this.driver = driver;
    }
    public void print(){
        System.out.println(getTextFromElement(enterFirstName));
        System.out.println(getTextFromElement(enterLastName));
    }

}
