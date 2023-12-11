package org.ninja.testsuite;

import org.ninja.pages.DesktopPage;
import org.ninja.pages.LaptopAndNoteBooksPage;
import org.ninja.pages.TopMenuPage;
import org.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class LaptopAndNoteBooksTestGrouping extends TestBase {

    TopMenuPage topMenuPage =new TopMenuPage();
    LaptopAndNoteBooksPage laptopAndNoteBooksPage =new LaptopAndNoteBooksPage();

    DesktopPage desktopPage =new DesktopPage();

    @Test (groups = "sanity")
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        topMenuPage.clickLaptopAndNotebooks();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.sortByPrice();
        laptopAndNoteBooksPage.verifyProductView();
    }
    @Test (groups = "smoke")
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        topMenuPage.clickLaptopAndNotebooks();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.sortByPrice();
        laptopAndNoteBooksPage.verifyProductView();
        laptopAndNoteBooksPage.clickMacBook();
        laptopAndNoteBooksPage.verifyMacBook();
        desktopPage.AddtoCart();
        desktopPage.clickShoppingCartDisplay();
        laptopAndNoteBooksPage.verifyMacBook();
        //desktopPage.verifyLinkShoppingCartDisplay();
        laptopAndNoteBooksPage.clearQtyL();
        laptopAndNoteBooksPage.verifyPrice();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.clickCheckout();
        laptopAndNoteBooksPage.clickGuestCheckout();
        laptopAndNoteBooksPage.clickContinue();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.fillMandatory();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.enterTextArea();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.checkTermsAndConditionF();
        Thread.sleep(3000);
        laptopAndNoteBooksPage.clickContinueForm();
    }
}
