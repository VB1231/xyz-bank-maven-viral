package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends Utility {

    //click on Deposit
    By deposit = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]");
    public void clickOnDeposit(){
        clickOnElement(deposit);
    }
    //enter deposit Amount
    By enterAmount = By.xpath("//input[@placeholder='amount']");
    public void enterDebitAmount(String debitAmount){
        sendTextToElement(enterAmount,debitAmount);
    }
    //click on DepositButton
    By clickDepositButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    public void clickDepositButton(){
       clickOnElement(clickDepositButton);
    }
    //verify Text Deposit Successfully
    By verifyTextDeposit = By.xpath("//span[contains(text(),'Deposit Successful')]");

    public String verifyTextDepositSuccessfully(){
        return getTextFromElement(verifyTextDeposit);
    }
    //Click on Withdraw Tab
    By withdraw = By.xpath("//div[@class='center']/button[3]");
    public void clickWithdraw(){
        mouseHoverToElementAndClick(withdraw);
    }
    //set withdrawal amount
    By setWithdrawAmount = By.xpath("//input[@placeholder='amount']");
    public void setWithdrawAmount(String a){
        sendTextToElement(setWithdrawAmount,a);
    }
    //click on Withdraw Button
    By clickWithdrawButton = By.xpath("//button[normalize-space()='Withdraw']");
    public void clickOnWithdrawButton(){
        clickOnElement(clickWithdrawButton);
    }
    //get verify Text Message
    By verifyTextTransaction = By.xpath("//span[@ng-show='message']");
    public String verifyTextTransaction(){
        return getTextFromElement(verifyTextTransaction);
    }
    public  AccountPage(WebDriver driver){
        this.driver = driver;
    }
}
