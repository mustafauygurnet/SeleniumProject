package dev.uygur.pages;

import dev.uygur.methods.Methods;
import org.openqa.selenium.By;

public class RandomProductPage {

    Methods methods;

    public RandomProductPage(){
        methods = new Methods();
    }

    public void goTo(){

        clickSubCategoryHobby();
        selectRandomProduct();
        addToCart();
    }

    private void clickSubCategoryHobby() {
        methods.click(By.cssSelector(".js-ajaxCt.js-bookCt>li:nth-of-type(3)"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector("[href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySecond(4);
    }

    private void selectRandomProduct() {

        methods.randomElement(By.cssSelector(".product-grid.jcarousel-skin-opencart>.mg-b-10")).click();
        methods.waitBySecond(5);

    }

    private void addToCart() {
        methods.click(By.cssSelector("#button-cart>span"));
        methods.waitBySecond(5);
    }
}
