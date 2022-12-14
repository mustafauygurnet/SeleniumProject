package dev.uygur.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");


        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--disable-notification");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--allowed-ips");

        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://www.kitapyurdu.com");
    }

    @After
    public void tearDown() {

        if (webDriver != null) {
            webDriver.close();
            webDriver.quit();
        }
    }
}
