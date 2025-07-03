package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private final By TITLE = By.cssSelector("[data-test=title]");

    private final By CART_BAGE = By.cssSelector(".shopping_cart_badge");

    private final By ADD_BUTTON = By.cssSelector(".btn_inventory");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    public String getUrl() {
        return BASE_URL + "inventory.html";
    }

    public void addFirstProductToCart() {
        driver.findElement(ADD_BUTTON).click();
    }

    public String getBageNumber() {
        return driver.findElement(CART_BAGE).getText();
    }

}