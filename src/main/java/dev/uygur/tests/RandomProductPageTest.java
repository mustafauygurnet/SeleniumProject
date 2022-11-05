package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.RandomProductPage;
import org.junit.Test;

public class RandomProductPageTest extends BaseTest {

    @Test
    public void goTo(){

        RandomProductPage randomProductPage = new RandomProductPage();
        randomProductPage.goTo();

    }

}
