package JAVA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Tabela_kalorii_logowanie {
    static WebDriver driver = new WebDriver() {
        @Override
        public void get(String s) {

        }

        @Override
        public String getCurrentUrl() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public List<WebElement> findElements(By by) {
            return null;
        }

        @Override
        public WebElement findElement(By by) {
            return null;
        }

        @Override
        public String getPageSource() {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public void quit() {

        }

        @Override
        public Set<String> getWindowHandles() {
            return null;
        }

        @Override
        public String getWindowHandle() {
            return null;
        }

        @Override
        public TargetLocator switchTo() {
            return null;
        }

        @Override
        public Navigation navigate() {
            return null;
        }

        @Override
        public Options manage() {
            return null;
        }
    };


    @Test
    public void logowanie_test() {
        driver.get("https://www.tabele-kalorii.pl/logowanie,wyloguj,0,nielogujautomatycznie,0.php");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nazwa_uzytkownika\"]"));
        element.sendKeys("nataliamarianowak95");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"haslo_uzytkownika\"]"));
        element1.sendKeys("nataliamarianowak95");
        element1.submit();
    }
    @Test
    public void raporty_test(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"naglowek-zaloguj\"]/a[2]"))).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-smartfony\"]/a[3]"));
        element.click();
        }
    @Test
    public void witaminy_test(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mnt-przycisk3\"]"))).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mnt-przycisk3\"]"));
        element.click();
    }
    @Parameters({"value"})
    @BeforeSuite
    public void before_method(@Optional("chrome") String value) {

        if (value.equals("chrome")) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }
    @AfterSuite
    public void afterMethod() {
        driver.quit();
    }
}