package org.ninja.pages;

import org.ninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

    By myAccount = By.xpath("//div[@class='nav pull-right']/ul[1]/li[2]/a/span[1]");

    By register = By.xpath("//div[@class='nav pull-right']/ul[1]/li[2]/ul/li[1]/a");

    By registerV = By.xpath("//div[@id='account-register']/div[1]/div[1]/h1");

    By login = By.xpath("//div[@class='nav pull-right']/ul[1]/li[2]/ul/li[2]/a");

    By loginV = By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div/h2");

    By firstName = By.xpath("//input[@id='input-firstname']");

    By lastName = By.xpath("//input[@id='input-lastname']");

    By email = By.xpath("//input[@id='input-email']");

    By telephone = By.xpath("//input[@id='input-telephone']");

    By password = By.xpath("//input[@id='input-password']");

    By cPassword = By.xpath("//input[@id='input-confirm']");

    By radiobtn = By.xpath("//div[@class='form-group']/div/label[1]/input");

    By checkBox = By.xpath("//div[@class='pull-right']/input[1]");

    By continueM = By.xpath("//div[@class='pull-right']/input[2]");

    By continuebtn = By.xpath("//a[@class='btn btn-primary']");

    By logout = By.xpath("//div[@id='top-links']/ul[1]/li[2]/ul/li[5]/a");

    By accountLogout = By.xpath("//div[@id='common-success']/div/div/h1");

    By loginbtn = By.xpath("//input[@class='btn btn-primary']");

    By myAccountv = By.xpath("//div[@id='account-account']/div[1]/div/h2[1]");

    By accountoptions = By.xpath("//div[@id='top-links']/ul[1]/li[2]/ul/li[5]/a");

    By accountlV = By.xpath("//div[@id='common-success']/div[1]/div/h1");

    By logoutMy = By.xpath("//a[@class='btn btn-primary']");

    public void clickMyAccount()
    {
        mouseHoverToElementAndClick(myAccount);
    }
    public void clickRegister()
    {
        clickOnElement(register);
    }
    public String verifyRegister()
    {
        return getTextFromElement(registerV);
    }
    public void clickLogin()
    {
        clickOnElement(login);
    }
    public String verifyLogin()
    {
        return getTextFromElement(loginV);
    }
    public void fillMandatoryForm()
    {
        sendTextToElement(firstName,"Shiv");
        sendTextToElement(lastName,"Patel");
        sendTextToElement(email,"shiv1234@gmail.com");
        sendTextToElement(telephone,"6475635467");
        sendTextToElement(password,";Shiv1234");
        sendTextToElement(cPassword,";Shiv1234");
        clickOnElement(radiobtn);
        clickOnElement(checkBox);
        clickOnElement(continueM);
    }
    public void clickContinueBtn()
    {
        clickOnElement(continuebtn);
    }
    public void clickLogout()
    {
        clickOnElement(logout);
    }
    public String verifyAccountLogout()
    {
        return getTextFromElement(accountLogout);
    }
    public void clickEmail()
    {
        sendTextToElement(email,"Shiv1234@gmail.com");
    }
    /*public void clicklirstName()
    {
        sendTextToElement(lastName,"Patel");
    }*/
    public void clickPassword()
    {
        sendTextToElement(password,";Shiv1234");
    }
    public void clickLoginbtn()
    {
        clickOnElement(loginbtn);
    }
    public String verifyMyAccount()
    {
        return getTextFromElement(myAccountv);
    }
    public void clickAccountOptions()
    {
        clickOnElement(accountoptions);
    }
    public String verifyAccountLogoutMy()
    {
        return getTextFromElement(accountlV);
    }
    public void clickMyC()
    {
        clickOnElement(logoutMy);
    }
}
