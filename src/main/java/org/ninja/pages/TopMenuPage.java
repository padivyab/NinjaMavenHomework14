package org.ninja.pages;

import org.ninja.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

    By DesktopTab = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]/a");
    By selectMenuD = By.xpath("//ul[@class='nav navbar-nav']/li[1]/div[1]/a");
    By LaptopAndnotebookTab = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]/a");
    By selectMenuL = By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a");
    By Components = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]/a");
    By selectMenuC = By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");

    /*public void selectMenu(String menu)
    {
        clickOnElement(By.xpath(menu));
    }*/
    public void clickDesktop() throws InterruptedException {
       mouseHoverToElementAndClick(DesktopTab);
        Thread.sleep(3000);
        clickOnElement(selectMenuD);
    }
    public String VerifyDesktop()
    {
        return getTextFromElement(DesktopTab);
    }
    public void clickLaptopAndNotebooks()
    {
        mouseHoverToElementAndClick(LaptopAndnotebookTab);
        clickOnElement(selectMenuL);
    }
    public String VerifyLaptopAndNotebook()
    {
        return getTextFromElement(LaptopAndnotebookTab);
    }
    public void clickComponents()
    {
        mouseHoverToElementAndClick(Components);
        clickOnElement(selectMenuC);
    }
    public String VerifyComponents()
    {
        return getTextFromElement(Components);
    }

}
