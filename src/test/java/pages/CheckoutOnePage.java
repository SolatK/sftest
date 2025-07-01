package pages;

import org.openqa.selenium.WebDriver;

public class CheckoutOnePage extends BasePage{
    public CheckoutOnePage(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return BASE_URL + "checkout-step-one.html";
    }
}
