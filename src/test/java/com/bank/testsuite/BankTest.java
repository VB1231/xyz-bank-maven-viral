package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage(driver);
    HomePage homePage = new HomePage(driver);
    CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
    OpenAccountPage openAccountPage = new OpenAccountPage(driver);
    CustomerPage customerPage = new CustomerPage(driver);
    AccountPage accountPage = new AccountPage(driver);
    AddCustomerPage addCustomerPage = new AddCustomerPage(driver);

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerButton();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterAddFirstName("Viral");
        addCustomerPage.enterAddLastName("Testing");
        addCustomerPage.enterPostCode("WD23 7AB");
        addCustomerPage.clickAfterAddingDetail();
        Thread.sleep(5000);
       Assert.assertEquals(bankManagerLoginPage.popUPTextVerify(), "Customer added successfully with customer id :6", "Not verify");
       bankManagerLoginPage.closePopUp();
       homePage.clickOnHomePage();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {


        homePage.clickOnBankManagerButton();
        bankManagerLoginPage.clickOnOpenAccount();
        Thread.sleep(2000);
        openAccountPage.searchCustomer("Harry Potter");
        Thread.sleep(1000);
        openAccountPage.selectCurrency("Pound");
        openAccountPage.setClickOnProcess();
        Assert.assertEquals(openAccountPage.popUpText(), "Account created successfully with account Number :1016", "Not verify");
        openAccountPage.clickOnPopUp();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginPage();
        customerLoginPage.searchCustomerOnCustomerLoginPage("Harry Potter");
        customerLoginPage.clickOnCustomerLoginOnCustomerLoginPage();
        Thread.sleep(400);
        Assert.assertEquals(customerPage.verifyLogoutText(), "Logout", "Not verify");
        customerPage.clickOnLogOut();
        Assert.assertEquals(customerPage.verifyYourNameText(), "Your Name :", "Not verify");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginPage();
        customerLoginPage.searchCustomerOnCustomerLoginPage("Harry Potter");
        customerLoginPage.clickOnCustomerLoginOnCustomerLoginPage();
        Thread.sleep(400);
        accountPage.clickOnDeposit();
        accountPage.enterDebitAmount("1000");
        accountPage.clickDepositButton();
        Assert.assertEquals(accountPage.verifyTextDepositSuccessfully(), "Deposit Successful", "Not verify");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

        homePage.clickOnCustomerLoginPage();
        customerLoginPage.searchCustomerOnCustomerLoginPage("Hermoine Granger");
        customerLoginPage.clickOnCustomerLoginOnCustomerLoginPage();
        Thread.sleep(400);
        accountPage.clickWithdraw();
        accountPage.setWithdrawAmount("50");
        accountPage.clickOnWithdrawButton();
        Assert.assertEquals(accountPage.verifyTextTransaction(), "Transaction successful", "Not verify");
    }

}
