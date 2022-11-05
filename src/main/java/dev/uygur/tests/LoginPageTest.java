package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;



public class LoginPageTest extends BaseTest {

    Logger logger;
    public LoginPageTest(){
        logger = LogManager.getLogger(LoginPageTest.class);

    }
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
        addressPage.logOut();
        logger.info("login başarılı");
        //productPage.searchProduct();
        //logger.info("search başarılı");
        //pointCatalogPage.goTo();
        //logger.info("point catalog başarılı");
        //randomProductPage.goTo();
        //logger.info("product prosses başarılı");
        //favoritePage.goTo();
        //logger.info("favorite page başarılı");
        //cartPage.goTo();
        //logger.info("cart page başarılı");
        //addressPage.goTo();
        logger.info("address ekleme başarılı");

    }

}
