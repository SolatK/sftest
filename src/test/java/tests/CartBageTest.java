package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class CartBageTest extends BaseTest{


    @Test(
            description = "Проверка на отображения количества товаров в корзине возле значка корзины",
            testName = "Количество товаров в корзине",
            expectedExceptions = NoSuchElementException.class
    )
    public void bageTest() {
        loginStandardUser();

        //значок корзины пустой
        softAssert.assertNull(productsPage.getBageNumber());

        productsPage.addFirstProductToCart();

        //1 после добавления товара
        softAssert.assertEquals(productsPage.getBageNumber(), "1");
        softAssert.assertAll();


    }
}
