package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private final By CONTINUE_BUTTON = By.id("continue-shopping");
    private final By CHECKOUT_BUTTON = By.id("checkout");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "cart.html");
    }

    public void clickContinue() {
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public boolean isContinueDisplayed() {
        return driver.findElement(CONTINUE_BUTTON).isDisplayed();
    }

    public boolean isCheckoutDisplayed() {
        return driver.findElement(CHECKOUT_BUTTON).isDisplayed();
    }

    public void checkout() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }
}
