package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class ContinueShoppnigDisplayTest extends BaseTest{

    @Test(
            description = "Проверка на отображение кнопки продолжить покупки",
            testName = "Отображение кнопки продолжить"
    )
    public void buttonCheck() {
        loginStandardUser();

        CartPage cartPage = new CartPage(driver);
        cartPage.open();

        //кнопка продолжения отображается
        Assert.assertTrue(cartPage.isContinueDisplayed());

    }
}
