package org.ninja.pages;

import org.ninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopAndNoteBooksPage extends Utility {

    By sortByHighToLow = By.xpath("//select[@id='input-sort']");

    By productPriceV = By.xpath("//select[@id='input-sort']/option[5]");

    By macBook = By.linkText("MacBook");

    //By macBookV = By.linkText("MacBook");
    //By macBookV = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[2]/a");
    By clearQty = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input");
    By updateQty = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input");
    By clickUpdate = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/span/button[1]");
    By priceV = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[6]");

    By checkout = By.xpath("//div[@class='buttons clearfix']/div[2]/a");

    By guestCheckout = By.xpath("//div[@class='panel-collapse collapse in']/div[1]/div[1]/div[1]/div[2]/label/input");

    By continueL = By.xpath("//input[@id='button-account']");

    By firstName = By.xpath("//input[@id='input-payment-firstname']");

    By lastName = By.xpath("//input[@id='input-payment-lastname']");

    By email = By.xpath("//input[@id='input-payment-email']");

    By telephone = By.xpath("//input[@id='input-payment-telephone']");

    By address = By.xpath("//input[@id='input-payment-address-1']");

    By city = By.xpath("//input[@id='input-payment-city']");

    By postalCode = By.xpath("//input[@id='input-payment-postcode']");

    By country = By.xpath("//select[@id='input-payment-country']");

    By selectState = By.xpath("//select[@id='input-payment-zone']");

    By continueF = By.xpath("//input[@id='button-guest']");

    By textArea = By.xpath("//div[@id='collapse-payment-method']/div[1]/p[2]/textarea");

    By checkTermsAndCondition = By.xpath("//div[@id='collapse-payment-method']/div[1]/div[2]/div[1]/input[1]");
    By continueP = By.xpath("//div[@id='collapse-payment-method']/div[1]/div[2]/div[1]/input[2]");


    public void sortByPrice()
    {
        selectByVisibleTextFromDropDown(sortByHighToLow,"Price (High > Low)");
    }
    public String verifyProductView()
    {
        return getTextFromElement(productPriceV);
    }
    public void clickMacBook()
    {
        clickOnElement(macBook);
    }
    public String verifyMacBook()
    {
        return getTextFromElement(macBook);

    }
    public void clearQtyL() throws InterruptedException {
        driver.findElement(clearQty).clear();
        Thread.sleep(3000);
        sendTextToElement(updateQty,"2");
        clickOnElement(clickUpdate);
    }
    public String verifyPrice()
    {
        return getTextFromElement(priceV);
    }
    public void clickCheckout()
    {
        clickOnElement(checkout);
    }
    public void clickGuestCheckout()
    {
        clickOnElement(guestCheckout);
    }
    public void clickContinue()
    {
        clickOnElement(continueL);
    }
    public void fillMandatory()
    {
        sendTextToElement(firstName,"Shiv");
        sendTextToElement(lastName,"Patel");
        sendTextToElement(email,"shiv1234@gmail.com");
        sendTextToElement(telephone,"6475676573");
        sendTextToElement(address,"283 cedar blvd");
        sendTextToElement(city,"Oshawa");
        sendTextToElement(postalCode,"L1G3E4");
        selectByValueFromDropDown(country,"38");
        selectByVisibleTextFromDropDown(selectState,"Ontario");
        clickOnElement(continueF);

    }
    public void enterTextArea()
    {
        sendTextToElement(textArea,"registration form");
    }
    public void checkTermsAndConditionF()
    {
        clickOnElement(checkTermsAndCondition);
    }
    public void clickContinueForm()
    {
        clickOnElement(continueP);
    }

}
