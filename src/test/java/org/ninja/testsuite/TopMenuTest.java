package org.ninja.testsuite;

import org.ninja.pages.TopMenuPage;
import org.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage =new TopMenuPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
       // topMenuPage.m2();
        topMenuPage.clickDesktop();
        topMenuPage.VerifyDesktop();
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        topMenuPage.clickLaptopAndNotebooks();
        Thread.sleep(3000);
        topMenuPage.VerifyLaptopAndNotebook();
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        topMenuPage.clickComponents();
        Thread.sleep(3000);
        topMenuPage.VerifyComponents();
    }

}
