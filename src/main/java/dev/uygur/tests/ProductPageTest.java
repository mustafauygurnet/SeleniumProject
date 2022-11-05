package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.LoginPage;
import dev.uygur.pages.PointCatalogPage;
import dev.uygur.pages.ProductPage;
import org.junit.Test;

public class ProductPageTest extends BaseTest {



    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        PointCatalogPage pointCatalogPage = new PointCatalogPage();

        loginPage.login();
        productPage.searchProduct();
        pointCatalogPage.goTo();
    }

}
