package dev.uygur.pages;

import dev.uygur.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PointCatalogPage {

    Methods methods;
    Logger logger;

    public PointCatalogPage() {
        methods = new Methods();
        logger = LogManager.getLogger(ProductPage.class);
    }

    public void goTo() {

        LoginPage loginPage = new LoginPage();

        loginPage.login();
        goToFavorite();

        //goToPointCatalog();
        //clickTurkishClassics();
        //clickSelectHighRating();
        //clickSubCategoryHobby();
        //selectRandomProduct();
        //addToCart();
        //goToFavorite();
        //removeThirdProductInFavorite();
        goToCart();
        quantityIncrement();
        buyProduct();
        inputAddressInfos();
        AddressInfosContinuous();
    }


    private void goToPointCatalog() {
        methods.click(By.cssSelector(".lvl1catalog>a"));
        methods.waitBySecond(3);

    }

    private void clickTurkishClassics() {
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[@class=\"landing-block\"]/a[2]/img[@title = \"Puan Kataloğundaki Türk Klasikleri\"]"));
        methods.waitBySecond(4);
    }

    private void clickSelectHighRating() {
        methods.selectByText(By.cssSelector(".sort>select"), "Yüksek Oylama");
        methods.waitBySecond(4);
    }

    private void clickSubCategoryHobby() {
        methods.click(By.cssSelector(".js-ajaxCt.js-bookCt>li:nth-of-type(3)"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector("[href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySecond(5);
    }

    private void selectRandomProduct() {

        methods.waitBySecond(5);
        methods.randomElement(By.cssSelector(".product-grid.jcarousel-skin-opencart>.mg-b-10")).click();
        methods.waitBySecond(5);

    }

    private void addToCart() {
        methods.click(By.cssSelector("#button-cart>span"));
        methods.waitBySecond(5);
    }

    private void goToFavorite() {
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>a"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.waitBySecond(3);
    }

    private void removeThirdProductInFavorite() {

        methods.click(By.cssSelector(".display-item>.sprite.sprite-icon-list"));
        methods.waitBySecond(5);
        methods.click(By.xpath("//div[@class=\"product-list\"]/div[3]/div[2]/div[@class=\"hover-menu\"]/a[3]"));
        methods.waitBySecond(3);
    }

    private void goToCart() {
        methods.click(By.cssSelector("#sprite-cart-icon>span"));
        methods.waitBySecond(2);

        methods.click(By.xpath("//div[@class=\"mg-b-5\"]/a[@id=\"js-cart\"]"));
        methods.waitBySecond(3);
    }

    private void quantityIncrement() {
        String quantity = methods.getValue(By.xpath("//form[@class=\"js-cart-update-product\"]/input[@value]"));
        methods.waitBySecond(3);

        int quantityNumber = Integer.parseInt(quantity);
        quantityNumber = quantityNumber + 1;
        methods.waitBySecond(4);

        methods.clear(By.cssSelector(".js-cart-update-product>input"));
        methods.sendKeys(By.cssSelector(".js-cart-update-product>input"),String.valueOf(quantityNumber));
        methods.waitBySecond(3);
        methods.findElement(By.cssSelector(".js-cart-update-product>input")).sendKeys(Keys.ENTER);
        methods.waitBySecond(8);
    }

    private void buyProduct(){
        methods.click(By.cssSelector(".to-wishlist>a"));
        methods.waitBySecond(4);
    }

    private void inputAddressInfos(){
        methods.click(By.cssSelector("#shipping-tabs > a:nth-child(2)"));
        methods.waitBySecond(4);


        methods.sendKeys(By.id("address-firstname-companyname"),"Mustafa");
        methods.sendKeys(By.id("address-lastname-title"),"Uygur");

        methods.sendKeys(By.id("address-zone-id"),"İstanbul");
        methods.waitBySecond(4);
        methods.sendKeys(By.id("address-county-id"),"EYÜPSULTAN");
        methods.sendKeys(By.id("address-address-text"),"ORDU CAD. No:125 Kat:1 Daire:1");

        methods.sendKeys(By.id("district"),"YENİDOĞAN MAH");
        methods.sendKeys(By.id("address-postcode"),"34245");
        methods.sendKeys(By.id("address-mobile-telephone"),"5334678290");
        methods.sendKeys(By.id("address-tax-id"),"52168107718");

        methods.waitBySecond(4);
    }

    private void AddressInfosContinuous(){
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(3);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(3);

        CreditCardInfos();
    }

    private void CreditCardInfos(){
        methods.sendKeys(By.id("credit-card-owner"),"Mustafa Uygur");
        methods.sendKeys(By.id("credit_card_number_1"),"4912");
        methods.sendKeys(By.id("credit_card_number_2"),"0550");
        methods.sendKeys(By.id("credit_card_number_3"),"4440");
        methods.sendKeys(By.id("credit_card_number_4"),"8591");
        methods.waitBySecond(3);

        methods.sendKeys(By.id("credit-card-expire-date-month"),"09");
        methods.sendKeys(By.id("credit-card-expire-date-year"),"2023");
        methods.sendKeys(By.id("credit-card-security-code"),"202");

        methods.waitBySecond(7);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(3);

        methods.click(By.cssSelector(".checkout-logo"));
        methods.waitBySecond(3);
    }

    private void logOut(){
        methods.click(By.xpath("//div[@class=\"menu top login\"]//a[@class=\"common-sprite\"]"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//div[@class=\"menu top login\"]/ul/li/div/ul/li[4]"));
        methods.waitBySecond(3);
    }
}
