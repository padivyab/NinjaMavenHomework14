package org.ninja.testsuite;

import org.ninja.pages.DesktopPage;
import org.ninja.pages.TopMenuPage;
import org.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {

    TopMenuPage topMenuPage =new TopMenuPage();
    DesktopPage desktopPage =new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        topMenuPage.clickDesktop();
        desktopPage.clickZtoA();
        desktopPage.verifyZtoAD();
    }
    @Test
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
