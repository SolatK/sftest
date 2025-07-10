package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class CheckoutButtonDisplayTest extends BaseTest{

    @Test(
            description = "Проверка на наличие кнопки чекаута",
            testName = "Отображение кнопки чекаута"
    )
    public void buttonCheck() {
        loginStandardUser();

        CartPage cartPage = new CartPage(driver);
        cartPage.open();

        //кнопка чекаута отображается
        Assert.assertTrue(cartPage.isCheckoutDisplayed());

    }
}
