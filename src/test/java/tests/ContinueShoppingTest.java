package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutOnePage;
import pages.ProductsPage;

public class ContinueShoppingTest extends BaseTest{

    @Test(
            description = "Проверка на работоспособность кнопки продолжения покупок",
            testName = "Работа кнопки продолжить"
    )
    public void buttonTest() {
        loginStandardUser();

        CartPage cartPage = new CartPage(driver);
        cartPage.open();
        cartPage.clickContinue();

        //кнопка продолжения действительно возвращает нас куда надо
        Assert.assertEquals(driver.getCurrentUrl(), productsPage.getUrl());

    }
}
