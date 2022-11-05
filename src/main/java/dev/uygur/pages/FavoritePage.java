package dev.uygur.pages;

import dev.uygur.methods.Methods;
import org.openqa.selenium.By;

public class FavoritePage {

    Methods methods;

    public FavoritePage(){
        methods = new Methods();
    }

    public void goTo(){

        goToFavorite();
        removeThirdProductInFavorite();
    }


    private void goToFavorite() {
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>a"));
        methods.waitBySecond(1);
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.waitBySecond(3);
    }

    private void removeThirdProductInFavorite() {

        methods.click(By.xpath("//div[@class=\"product-list\"]/div[3]/div[2]/div[@class=\"hover-menu\"]/a[3]"));
        methods.waitBySecond(4);
    }
}
