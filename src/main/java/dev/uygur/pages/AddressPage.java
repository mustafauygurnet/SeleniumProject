package dev.uygur.pages;

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


        methods.sendKeys(By.id("address-firstname-companyname"),"Mustafa");
        methods.sendKeys(By.id("address-lastname-title"),"Uygur");

        methods.sendKeys(By.id("address-zone-id"),"İstanbul");
        methods.waitBySecond(2);
        methods.sendKeys(By.id("address-county-id"),"EYÜPSULTAN");
        methods.sendKeys(By.id("address-address-text"),"ORDU CAD. No:125 Kat:1 Daire:1");

        methods.sendKeys(By.id("district"),"YENİDOĞAN MAH");
        methods.sendKeys(By.id("address-postcode"),"34245");
        methods.sendKeys(By.id("address-mobile-telephone"),"5334678290");
        methods.sendKeys(By.id("address-tax-id"),"52168107718");

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
        methods.click(By.xpath("//div[@class=\"menu top login\"]/ul/li/div/ul/li[4]/a[@href]"));
        methods.waitBySecond(3);
    }
}
