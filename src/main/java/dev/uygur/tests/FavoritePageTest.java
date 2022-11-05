package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.FavoritePage;
import org.junit.Test;

public class FavoritePageTest extends BaseTest {

    @Test
    public void goTo(){

        FavoritePage favoritePage = new FavoritePage();
        favoritePage.goTo();

    }


}

