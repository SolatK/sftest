package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class CheckoutButtonDisplayTest extends BaseTest{

    @Test
    public void buttonCheck() {
        loginStandardUser();

        CartPage cartPage = new CartPage(driver);
        cartPage.open();

        //кнопка чекаута отображается
        Assert.assertTrue(cartPage.isCheckoutDisplayed());

    }
}
