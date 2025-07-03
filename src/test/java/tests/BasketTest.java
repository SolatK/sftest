package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class BasketTest extends BaseTest{

    @Test
    public void basketTest() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".submit-button")).click();

        driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]/following::button")).click();
        driver.findElement(By.cssSelector(".shopping_cart_badge")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(".cart_item_label .inventory_item_name")).getText(), "Sauce Labs Backpack");
        Assert.assertEquals(driver.findElement(By.cssSelector(".cart_item_label .inventory_item_price")).getText(), "$29.99");
    }
}
