package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.LoginPage;
import dev.uygur.pages.ProductPage;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }

}
