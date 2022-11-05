package dev.uygur.pages;

import dev.uygur.constants.Messages;
import dev.uygur.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger;

    public ProductPage() {
        methods = new Methods();
        logger = LogManager.getLogger(ProductPage.class);
    }

    public void searchProduct() {

        searchToText();
        scrollThePage();
        addProductToFavorite();
        goToBackHomePage();
    }

    private void searchToText() {
        methods.sendKeys(By.id("search-input"), Messages.SEARCH_TEXT);
        methods.waitBySecond(5);

        methods.click(By.cssSelector(".button-search"));
        methods.waitBySecond(3);
    }

    private void scrollThePage() {
        methods.scrollWithAction(By.xpath("//div[@class=\"product-list\"]/div[7]"));
        methods.waitBySecond(5);
    }

    private void addProductToFavorite() {
        methods.click(By.xpath("//div[@class=\"product-list\"]/div[6]/div[@class=\"grid_2 alpha omega relative\"]/div[@class=\"hover-menu\"]/a[@class=\"add-to-favorites\"]"));
        methods.clickWithJavascript("onclick");
        methods.waitBySecond(5);

        String value6 = methods.getText(By.cssSelector(".swal2-title.ky-swal-title-single>a"));
        Assert.assertEquals("Favorilere ekleme işlemi yapılamadı.", Messages.FAVORITE_CONTROL_TEXT, value6);
        methods.waitBySecond(2);

        methods.click(By.xpath("//div[@class=\"product-list\"]/div[5]/div[@class=\"grid_2 alpha omega relative\"]/div[@class=\"hover-menu\"]/a[@class=\"add-to-favorites\"]"));
        methods.clickWithJavascript("onclick");
        methods.waitBySecond(3);

        String value5 = methods.getText(By.cssSelector(".swal2-title.ky-swal-title-single>a"));
        Assert.assertEquals("Favorilere ekleme işlemi yapılamadı.", Messages.FAVORITE_CONTROL_TEXT, value5);
        methods.waitBySecond(2);

        methods.click(By.xpath("//div[@class=\"product-list\"]/div[4]/div[@class=\"grid_2 alpha omega relative\"]/div[@class=\"hover-menu\"]/a[@class=\"add-to-favorites\"]"));
        methods.clickWithJavascript("onclick");
        methods.waitBySecond(3);

        String value4 = methods.getText(By.cssSelector(".swal2-title.ky-swal-title-single>a"));
        Assert.assertEquals("Favorilere ekleme işlemi yapılamadı.", Messages.FAVORITE_CONTROL_TEXT, value4);
        methods.waitBySecond(2);

        methods.click(By.xpath("//div[@class=\"product-list\"]/div[8]/div[@class=\"grid_2 alpha omega relative\"]/div[@class=\"hover-menu\"]/a[@class=\"add-to-favorites\"]"));
        methods.clickWithJavascript("onclick");
        methods.waitBySecond(3);

        String value8 = methods.getText(By.cssSelector(".swal2-title.ky-swal-title-single>a"));
        Assert.assertEquals("Favorilere ekleme işlemi yapılamadı.", Messages.FAVORITE_CONTROL_TEXT, value8);
        methods.waitBySecond(2);
    }

    private void goToBackHomePage() {

        methods.click(By.cssSelector(".logo-text>a"));
        methods.waitBySecond(3);
    }

}
