package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.LoginPage;
import dev.uygur.pages.PointCatalogPage;
import org.junit.Test;

public class PointCatalogPageTest extends BaseTest {

    @Test
    public void login(){

        PointCatalogPage loginPage = new PointCatalogPage();
        loginPage.goTo();

    }
}
