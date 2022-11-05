package dev.uygur.methods;

import dev.uygur.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver webDriver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor javascriptExecutor;

    public Methods() {
        webDriver = BaseTest.webDriver;
        wait = new FluentWait<>(webDriver);
        javascriptExecutor = (JavascriptExecutor) webDriver;

        wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(300)).ignoring(NoSuchElementException.class);
    }

    public WebElement findElement(By element) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void click(By element) {
        findElement(element).click();

    }

    public void waitBySecond(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By element){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void sendKeys(By element, String text) {
        findElement(element).sendKeys(text);
    }

    public void scrollWithAction(By element){

        Actions actions = new Actions(webDriver);
        actions.moveToElement(findElement(element)).build().perform();
    }

    public void scrollWithJavascript(By element){
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",findElement(element));
    }

    public void clickWithJavascript(String exec){
        javascriptExecutor.executeScript(exec);
    }

    public Select getSelect(By element){
        return new Select(findElement(element));
    }

    public void selectByText(By element, String text){
        getSelect(element).selectByVisibleText(text);
    }

    private int randomNumber(int number){
        Random random = new Random();
        return random.nextInt(number/3);
    }

    public WebElement randomElement(By element){
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        return elements.get(randomNumber(elements.size()));
    }

    public String getAttribute(By element, String attributeName){
        return findElement(element).getAttribute(attributeName);
    }
    public String getText(By element){
        return findElement(element).getText();
    }

    public String getValue(By element){
        return javascriptExecutor.executeScript("return arguments[0].value",findElement(element)).toString();
    }

    public void clear(By element){
        findElement(element).clear();
    }
}
