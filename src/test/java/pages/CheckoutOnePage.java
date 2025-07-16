package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage extends BasePage {
    public CheckoutOnePage(WebDriver driver) {
        super(driver);
    }

    @Step("Получение адреса страницы чекаута")
    public String getUrl() {
        return BASE_URL + "checkout-step-one.html";
    }
}
