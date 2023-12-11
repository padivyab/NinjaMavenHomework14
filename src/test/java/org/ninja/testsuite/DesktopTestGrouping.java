package org.ninja.testsuite;

import org.ninja.pages.DesktopPage;
import org.ninja.pages.TopMenuPage;
import org.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class DesktopTestGrouping extends TestBase {

    TopMenuPage topMenuPage =new TopMenuPage();
    DesktopPage desktopPage =new DesktopPage();

    @Test (groups = "sanity")
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        topMenuPage.clickDesktop();
        desktopPage.clickZtoA();
        desktopPage.verifyZtoAD();
    }
    @Test (groups = "smoke")
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        topMenuPage.clickDesktop();
        desktopPage.clickAtoZ();
        desktopPage.clickProduct();
        desktopPage.verifyText();
        desktopPage.clickDeliveryDate();
        desktopPage.clickQty();
        desktopPage.AddtoCart();
        Thread.sleep(3000);
        desktopPage.clickShoppingCartDisplay();
        desktopPage.verifyLinkShoppingCartDisplay();
        desktopPage.verifyText();
        desktopPage.verifyProductName();
        desktopPage.verifyDeliveryDate();
        desktopPage.verifyModel();
        desktopPage.verifyTotal();

    }

}
