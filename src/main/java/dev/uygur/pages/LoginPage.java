package dev.uygur.pages;

import dev.uygur.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger;

    public LoginPage(){
        methods = new Methods();
        logger = LogManager.getLogger(ProductPage.class);
    }

    public void login(){

        goToLoginPage();
        writeUserInfos();
        clickLoginButton();
        doLoginControl();

    }


    private void goToLoginPage(){
        methods.click(By.cssSelector(".login>a"));
        logger.info("Login sayfası açıldı.");
        methods.waitBySecond(5);
    }

    private void writeUserInfos(){
        methods.sendKeys(By.id("login-email"),"mustafauygurr@gmail.com");
        methods.sendKeys(By.id("login-password"),"123456789abcd");
        logger.info("Login sayfasına email ve password bilgileri girildi");
        methods.waitBySecond(2);
    }

    private void clickLoginButton(){
        methods.click(By.cssSelector(".ky-login-btn"));
        logger.info("Login sayfasında login butonuna tıklandı");
        methods.waitBySecond(15);
    }

    private void doLoginControl(){
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".common-sprite>b")));
        logger.info("Giriş başarılı bir şekilde yapıldı");
        methods.waitBySecond(3);
    }
}
