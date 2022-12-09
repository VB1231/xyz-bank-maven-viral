package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class OpenAccountPage extends Utility {
    By customerName = By.xpath("//form/div[1]/select[1]");
    public void searchCustomer(String name){
        List<WebElement> list = driver.findElements(customerName);
        ArrayList<String> nameList =new ArrayList<>();
        for(WebElement e :list)
        {
            nameList.add(e.getText());

        }
        System.out.println(nameList);


        selectByContainsTextFromDropDown(customerName,name);
    }
    By selectCurrency = By.id("currency");
    public void selectCurrency(String p){
        selectByContainsTextFromDropDown(selectCurrency,p);
    }
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");
    public void setClickOnProcess(){
        mouseHoverToElementAndClick(clickOnProcess);
    }
    public String popUpText(){
        return getTextFromAlert();
    }
    public void clickOnPopUp(){
        acceptAlert();
    }
    public  OpenAccountPage(WebDriver driver){
        this.driver = driver;
    }
}
