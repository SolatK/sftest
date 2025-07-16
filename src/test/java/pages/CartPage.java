package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By CONTINUE_BUTTON = By.id("continue-shopping");
    private final By CHECKOUT_BUTTON = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы корзины")
    public void open() {
        driver.get(BASE_URL + "cart.html");
    }

    @Step("Нажатие на кнопку продолжить покупки")
    public void clickContinue() {
        driver.findElement(CONTINUE_BUTTON).click();
    }

    @Step("Проверка на наличие кнопки продолжения покупок")
    public boolean isContinueDisplayed() {
        return driver.findElement(CONTINUE_BUTTON).isDisplayed();
    }

    @Step("Проверка на наличие кнопки чекаута")
    public boolean isCheckoutDisplayed() {
        return driver.findElement(CHECKOUT_BUTTON).isDisplayed();
    }

    @Step("Клик на кнопку чекаут")
    public void checkout() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }
}
