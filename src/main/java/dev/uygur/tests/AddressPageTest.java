package dev.uygur.tests;

import dev.uygur.driver.BaseTest;
import dev.uygur.pages.AddressPage;
import org.junit.Test;

public class AddressPageTest extends BaseTest {

    @Test
    public void goTo(){

        AddressPage addressPage = new AddressPage();
        addressPage.goTo();

    }
}
