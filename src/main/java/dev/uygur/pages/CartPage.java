package dev.uygur.pages;

import dev.uygur.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CartPage {

    Methods methods;

    public CartPage(){
        methods = new Methods();
    }

    public void goTo(){

        goToCart();
        quantityIncrement();
        buyProduct();
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
}
