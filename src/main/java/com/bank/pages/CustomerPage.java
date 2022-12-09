package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends Utility {
//click on login
    By clickOnLogin = By.xpath("//button[contains(text(),'Login')]");
    public void clickOnLogin(){
        clickOnElement(clickOnLogin);
    }
    //verify Logout
    By logOutText = By.xpath("//button[@class='btn logout']");
    public String verifyLogoutText(){
        return getTextFromElement(logOutText);
    }
    //click on LogOut
    public void clickOnLogOut(){
       mouseHoverToElementAndClick(logOutText);
    }
    //verify your name
    By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameText(){
        return getTextFromElement(verifyYourName);
    }
    public  CustomerPage(WebDriver driver){
        this.driver = driver;
    }

}
