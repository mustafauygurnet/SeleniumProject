package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.*;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        RandomProductPage randomProductPage = new RandomProductPage();
        FavoritePage favoritePage = new FavoritePage();
        CartPage cartPage = new CartPage();
        AddressPage addressPage = new AddressPage();


        loginPage.login();
        productPage.searchProduct();
        pointCatalogPage.goTo();
        randomProductPage.goTo();
        favoritePage.goTo();
        cartPage.goTo();
        addressPage.goTo();

    }

}
