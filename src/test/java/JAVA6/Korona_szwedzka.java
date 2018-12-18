package JAVA6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Korona_szwedzka {

    WebDriver driver;

    @Test
    public void kursKoronySzwedzkiej() {
        driver.get("https://www.waluty.pl/");
        WebElement element = driver.findElement(By.xpath("/html/body/div/main/div[2]/table/tbody/tr[5]/td[4]/span/strong"));
        String currency = element.getText();

        System.out.println("średni kurs korony szwedzkiej to: " + currency);
    }

        @BeforeMethod
        public void before(){
        driver = new ChromeDriver();
    }

        @AfterMethod
        public void afterMethod(){
        driver.quit();
    }
}
