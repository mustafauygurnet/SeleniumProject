package dev.uygur.pages;

import dev.uygur.constants.Messages;
import dev.uygur.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PointCatalogPage {

    Methods methods;
    Logger logger;

    public PointCatalogPage() {
        methods = new Methods();
        logger = LogManager.getLogger(ProductPage.class);
    }

    public void goTo() {

        goToPointCatalog();
        clickTurkishClassics();
        clickSelectHighRating();
    }

    private void goToPointCatalog() {
        methods.click(By.cssSelector(".lvl1catalog>a"));
        methods.waitBySecond(3);

    }

    private void clickTurkishClassics() {
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[@class=\"landing-block\"]/a[2]/img[@title = \"Puan Kataloğundaki Türk Klasikleri\"]"));
        methods.waitBySecond(3);
    }

    private void clickSelectHighRating() {
        methods.selectByText(By.cssSelector(".sort>select"), Messages.SELECT_POINT_CATALOG_HIGH_RATING);
        methods.waitBySecond(3);
    }

}
