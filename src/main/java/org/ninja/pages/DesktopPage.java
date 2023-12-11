package org.ninja.pages;

import org.ninja.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By selectNameZtoA = By.xpath("//select[@id='input-sort']");
    By verifyZtoA = By.xpath("//select[@id='input-sort']/option[3]");
    By selectAtoZ = By.xpath("//select[@id='input-sort']");
    By selectProduct = By.linkText("HP LP3065");
    By selectText = By.linkText("HP LP3065");
    By clearDeliveryDate = By.xpath("//div[@class='input-group date']/input");
    By updateDeliveryDate = By.xpath("//div[@class='input-group date']/input");
    By clearQty = By.xpath("//div[@class='form-group']/input[1]");
    By updateQty = By.xpath("//div[@class='form-group']/input[1]");
    By clickCart = By.xpath("//button[@id='button-cart']");

    By linkShoppingCart = By.xpath("//div[@id='product-product']/div/a[2]");

    By textShoppingCart = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[2]/a");

    By productNameV = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]");

    By DeliveryDateV = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]");

    By ModelV = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[5]");

    By TtotalV = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[6]");




    public void clickZtoA() throws InterruptedException {
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown(selectNameZtoA,"Name (Z - A)");
    }
    public String verifyZtoAD()
    {
        return getTextFromElement(verifyZtoA);
    }
    public void clickAtoZ() throws InterruptedException {
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown(selectAtoZ,"Name (A - Z)");
        Thread.sleep(3000);

    }
    public void clickProduct()
    {
        clickOnElement(selectProduct);
    }
    public String verifyText()
    {
        return getTextFromElement(selectText);
    }
    public void clickDeliveryDate() throws InterruptedException {
        driver.findElement(clearDeliveryDate).clear();
        Thread.sleep(3000);
        sendTextToElement(updateDeliveryDate,"2022-11-30");
    }
    public void clickQty() throws InterruptedException {
        driver.findElement(clearQty).clear();
        Thread.sleep(3000);
        sendTextToElement(updateQty,"1");
    }
    public void AddtoCart()
    {
        clickOnElement(clickCart);
    }
    public void clickShoppingCartDisplay()
    {
        clickOnElement(linkShoppingCart);
    }
    public String verifyLinkShoppingCartDisplay()
    {
        return getTextFromElement(textShoppingCart);
    }
    public String verifyProductName()
    {
        return getTextFromElement(productNameV);
    }
    public String verifyDeliveryDate()
    {
        return getTextFromElement(DeliveryDateV);
    }
    public String verifyModel()
    {
        return getTextFromElement(ModelV);
    }
    public String verifyTotal()
    {
        return getTextFromElement(TtotalV);
    }


}
