package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @DataProvider(name = "LoginData")
    public Object[][] provideDiscountData() {
        return new Object[][]{
                {"standard_user", "", "Epic sadface: Password is required"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"test", "test", "Epic sadface: Username and password do not match any user in this service"}
        };
    }

    @Test(
            description = "Проверка на возможность авторизации",
            testName = "Авторизация",
            groups = {"smoke"}
    )
    public void checkLoginPositive() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(productsPage.getTitle(),
                "Products",
                "Логин не выполнен");
    }

    @Test(dataProvider = "LoginData", priority = 2,
            description = "Вход с неверными данными, проверка сообщения об ошибке",
            testName = "Негативный тест на аутентификацию",
            dependsOnMethods = "checkLoginPositive")
    public void checkLoginWithNegativeValues(String username, String password, String expectedMessage) {
        loginPage.open();
        loginPage.login(username, password);
        assertEquals(loginPage.getErrorMessage(),
                expectedMessage,
                "Сообщение не соответствует");
    }
}