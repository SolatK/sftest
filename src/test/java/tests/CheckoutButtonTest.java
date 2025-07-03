package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutOnePage;

public class CheckoutButtonTest extends BaseTest{

    @Test
    public void buttonTest() {
        loginStandardUser();

        CartPage cartPage = new CartPage(driver);
        cartPage.open();
        cartPage.checkout();

        CheckoutOnePage checkoutOnePage = new CheckoutOnePage(driver);

        //кнопка чекаут отправила нас куда надо
        Assert.assertEquals(driver.getCurrentUrl(), checkoutOnePage.getUrl());

    }
}