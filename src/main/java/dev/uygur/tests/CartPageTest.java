package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.CartPage;
import org.junit.Test;

public class CartPageTest extends BaseTest {
    @Test
    public void goTo(){

        CartPage cartPage = new CartPage();
        cartPage.goTo();

    }
}
