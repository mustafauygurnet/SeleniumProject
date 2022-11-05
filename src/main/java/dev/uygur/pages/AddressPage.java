package dev.uygur.pages;

import dev.uygur.constants.Messages;
import dev.uygur.methods.Methods;
import org.openqa.selenium.By;

public class AddressPage {

    Methods methods;


    public AddressPage(){
    methods = new Methods();
    }

    public void goTo(){

        inputAddressInfos();
        addressInfosContinuous();
        logOut();
    }

    private void inputAddressInfos(){
        methods.click(By.cssSelector("#shipping-tabs > a:nth-child(2)"));
        methods.waitBySecond(4);


        methods.sendKeys(By.id("address-firstname-companyname"),Messages.FIRST_NAME);
        methods.sendKeys(By.id("address-lastname-title"),Messages.LAST_NAME);

        methods.sendKeys(By.id("address-zone-id"),Messages.CITY);
        methods.waitBySecond(2);
        methods.sendKeys(By.id("address-county-id"),Messages.ZONE);
        methods.sendKeys(By.id("address-address-text"),Messages.ADDRESS);

        methods.sendKeys(By.id("district"),Messages.DISTRICT);
        methods.sendKeys(By.id("address-postcode"),Messages.ZIP_CODE);
        methods.sendKeys(By.id("address-mobile-telephone"),Messages.PHONE_NUMBER);
        methods.sendKeys(By.id("address-tax-id"),Messages.NATIONAL_IDENTITY);

        methods.waitBySecond(4);
    }

    private void addressInfosContinuous(){
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(3);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(3);

        creditCardInfos();
    }

    private void creditCardInfos(){
        methods.sendKeys(By.id("credit-card-owner"), Messages.CREDIT_CARD_OWNER);
        methods.sendKeys(By.id("credit_card_number_1"),Messages.CREDIT_CARD_FIRST_NUMBER);
        methods.sendKeys(By.id("credit_card_number_2"),Messages.CREDIT_CARD_SECOND_NUMBER);
        methods.sendKeys(By.id("credit_card_number_3"),Messages.CREDIT_CARD_THIRD_NUMBER);
        methods.sendKeys(By.id("credit_card_number_4"),Messages.CREDIT_CARD_FOURTH_NUMBER);
        methods.waitBySecond(3);

        methods.sendKeys(By.id("credit-card-expire-date-month"),Messages.CREDIT_CARD_DATE_MONTH);
        methods.sendKeys(By.id("credit-card-expire-date-year"),Messages.CREDIT_CARD_DATE_YEAR);
        methods.sendKeys(By.id("credit-card-security-code"),Messages.CREDIT_CARD_CVV);

        methods.waitBySecond(7);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySecond(3);

        methods.click(By.cssSelector(".checkout-logo"));
        methods.waitBySecond(3);
    }

    private void logOut(){
        methods.findElement(By.cssSelector("div.menu.top.login>ul>li>div>ul>li:nth-child(4)>a"));
        methods.waitBySecond(2);

    }
}
