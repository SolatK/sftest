package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private final By TITLE = By.cssSelector("[data-test=title]");

    private final By CART_BAGE = By.cssSelector(".shopping_cart_badge");

    private final By ADD_BUTTON = By.cssSelector(".btn_inventory");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    @Step("Получение заголовка страницы")
    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    @Step("Открыть страницу с товарами")
    public String getUrl() {
        return BASE_URL + "inventory.html";
    }

    @Step("Добавить первый товар в корзину")
    public void addFirstProductToCart() {
        driver.findElement(ADD_BUTTON).click();
    }

    @Step("Получить значение значка товаров в корзине")
    public String getBageNumber() {
        return driver.findElement(CART_BAGE).getText();
    }

}