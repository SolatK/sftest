package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class LocatorTest extends BaseTest{

    @Test
    public void checkLocator(){
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("root"));
        driver.findElement(By.name("user-name"));
        driver.findElement(By.className("form_column"));
        driver.findElement(By.tagName("input"));

        driver.findElement(By.xpath("//*[@data-test='login-credentials-container']"));
        driver.findElement(By.xpath("//*[text()='Password for all users:']"));
        driver.findElement(By.xpath("//*[contains(@class,'pass')]"));
        driver.findElement(By.xpath("//*[contains(text(), \"secret_\")]"));
        driver.findElement(By.xpath("//*[contains(@class,'log')]/ancestor::div"));
        driver.findElement(By.xpath("//*[contains(@class,'pass')]/descendant::h4"));
        driver.findElement(By.xpath("//*[@id='login_button_container']/following::div"));
        driver.findElement(By.xpath("//*[@id='login_button_container']/parent::div"));
        driver.findElement(By.xpath("//*[@id='login_button_container']/preceding::div"));
        driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']"));

        driver.findElement(By.cssSelector(".input_error"));
        driver.findElement(By.cssSelector(".form_group .input_error"));
        driver.findElement(By.cssSelector(".form_group .form_input"));
        driver.findElement(By.cssSelector("#password"));
        driver.findElement(By.cssSelector("div"));
        driver.findElement(By.cssSelector("div.form_group"));
        driver.findElement(By.cssSelector("[type=password]"));
        driver.findElement(By.cssSelector("[type~=password]"));
        driver.findElement(By.cssSelector("[lang|=\"en\"]"));
        driver.findElement(By.cssSelector("[data-test^=login]"));
        driver.findElement(By.cssSelector("[data-test$=container]"));
        driver.findElement(By.cssSelector("[data-test*=cred]"));

        driver.quit();
    }
}

