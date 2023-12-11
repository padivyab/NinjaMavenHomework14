package org.ninja.testsuite;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.ninja.pages.MyAccountsPage;
import org.ninja.testbase.TestBase;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {


    MyAccountsPage myAccountsPage =new MyAccountsPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        myAccountsPage.clickMyAccount();
        Thread.sleep(3000);
        myAccountsPage.clickRegister();
        myAccountsPage.verifyRegister();
        Thread.sleep(3000);

    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        myAccountsPage.clickMyAccount();
        Thread.sleep(3000);
        myAccountsPage.clickLogin();
        Thread.sleep(300);
        myAccountsPage.verifyLogin();
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        myAccountsPage.clickMyAccount();
        Thread.sleep(3000);
        myAccountsPage.clickRegister();
        Thread.sleep(3000);
        myAccountsPage.fillMandatoryForm();
        Thread.sleep(3000);
        myAccountsPage.clickContinueBtn();
        Thread.sleep(3000);
        myAccountsPage.clickMyAccount();
        myAccountsPage.clickLogout();
        Thread.sleep(3000);
        myAccountsPage.verifyAccountLogout();

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        myAccountsPage.clickMyAccount();
        Thread.sleep(3000);
        myAccountsPage.clickLogin();
        Thread.sleep(3000);
        myAccountsPage.clickEmail();
        Thread.sleep(3000);
        myAccountsPage.clickPassword();
        myAccountsPage.clickLoginbtn();
        myAccountsPage.verifyMyAccount();
        Thread.sleep(3000);
        myAccountsPage.clickMyAccount();
        Thread.sleep(3000);
        myAccountsPage.clickAccountOptions();
        myAccountsPage.verifyAccountLogoutMy();
        Thread.sleep(3000);
        myAccountsPage.clickMyC();

    }
}
