package Auth;

import core.BaseUiTest;
import core.testData.TestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.pages.AuthorizationPage;

public class AuthorizationTest extends BaseUiTest {

    @BeforeMethod
    public void openPage() {
        openSite();
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.startButton.click();
        authPage.formsStartButton.click();
    }
    @Test(description = "Отображение элементов формы авторизации")
    void displayingElementsLoginForm() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginEmailHeader.shouldBeVisible();
        authPage.loginPasswordHeader.shouldBeVisible();
        authPage.loginEmailHeader.checkText("Email");
        authPage.loginPasswordHeader.checkText("Password");
        authPage.loginEmailField.shouldBeVisible();
        authPage.loginPasswordField.shouldBeVisible();
        authPage.loginAuthButton.shouldBeVisible();
        authPage.loginResetButton.shouldBeVisible();
    }

    @Test(description = "Отображение подсказок внутри полей формы авторизации")
    void displayingPlaceholderLoginForm() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginEmailField.checkPlaceholder(TestData.getPlaceholderEmail());
        authPage.loginPasswordField.checkPlaceholder(TestData.getPlaceholderPassword());
    }

    @Test(description = "Проверка корректности цвета кнопок")
    void checkColorButton() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginAuthButton.checkColorBackground(TestData.getButtonLoginColorBackground());
        authPage.loginResetButton.checkColorBackground(TestData.getButtonResetColorBackground());
    }

    @Test(description = "Проверка корректности цвета кнопки авторизации при наведении курсора")
    void checkHoverColorButton() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginAuthButton.hover();
        authPage.loginAuthButton.checkColorBackground(TestData.getButtonLoginColorBackground());
    }

    @Test(description = "Отображение введенных значений в поля формы авторизации")
    void displayingValueField() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginEmailField.fill(TestData.getTestEmail());
        authPage.loginEmailField.checkValue(TestData.getTestEmail());
        authPage.loginPasswordField.fill(TestData.getTestPassword());
        authPage.loginPasswordField.checkValue(TestData.getTestPassword());
    }

    @Test(description = "Проверка успешной авторизации")
    void checkCorrectLogin() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginEmailField.fill(TestData.getTestEmail());
        authPage.loginPasswordField.fill(TestData.getTestPassword());
        authPage.loginAuthButton.click();
        authPage.loginResult.shouldBeVisible();
        authPage.loginResult.checkText("Login successful! Welcome, " + TestData.getTestEmail() +".");
    }

    @Test(description = "Проверка корректности цвета поля с результатом успешной авторизации")
    void checkColorResult() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginEmailField.fill(TestData.getTestEmail());
        authPage.loginPasswordField.fill(TestData.getTestPassword());
        authPage.loginAuthButton.click();
        authPage.loginResult.shouldBeVisible();
        authPage.loginResult.checkColorBackground(TestData.getResultColorBackground());
        authPage.loginResult.checkBorder(TestData.getResultColorBorder());
    }

    @Test(description = "Проверка валидации пустого поля электронной почты формы авторизации")
    void validationEmptyEmail() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginAuthButton.click();
        authPage.loginErrorEmail.shouldBeVisible();
        authPage.loginErrorEmail.checkText("Email is required.");
    }

    @Test(description = "Проверка валидации пустого поля пароля формы авторизации")
    void validationEmptyPassword() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginAuthButton.click();
        authPage.loginErrorPassword.shouldBeVisible();
        authPage.loginErrorPassword.checkText("Password is required.");
    }

    @Test(description = "Проверка корректности цвета полей формы авторизации при введении невалидных значений")
    void checkInvalidColorFields() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginAuthButton.click();
        authPage.loginEmailField.checkBorderColor(TestData.getFieldErrorColorBorder());
        authPage.loginPasswordField.checkBorderColor(TestData.getFieldErrorColorBorder());
    }

    @Test(description = "Сброс введенных значений в полях формы авторизации")
    void checkReset() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.loginEmailField.fill(TestData.getTestEmail());
        authPage.loginPasswordField.fill(TestData.getTestPassword());
        authPage.loginResetButton.click();
        authPage.loginEmailField.checkValue("");
        authPage.loginPasswordField.checkValue("");
        authPage.loginEmailField.checkPlaceholder(TestData.getPlaceholderEmail());
        authPage.loginPasswordField.checkPlaceholder(TestData.getPlaceholderPassword());
    }

    @Test(description = "Введение невалидного значения без символа '@' в поле для электронной почты формы авторизации")
    void invalidEmailNotAt() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.verifyInvalidEmail(TestData.getTestInvalidEmailNotAt(),TestData.getErrorEmailValue());
    }

    @Test(description = "Введение невалидного значения с двумя символами '@' в поле для электронной почты формы авторизации")
    void invalidEmailDoubleAt() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.verifyInvalidEmail(TestData.getTestInvalidEmailDoubleAt(),TestData.getErrorEmailValue());
    }

    @Test(description = "Введение невалидного значения без доменной части в поле для электронной почты формы авторизации")
    void invalidEmailNotDomain() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.verifyInvalidEmail(TestData.getTestInvalidEmailNotDomain(),TestData.getErrorEmailValue());
    }

    @Test(description = "Введение невалидного значения с пробелом в поле для электронной почты формы авторизации")
    void invalidEmailSpace() {
        AuthorizationPage authPage = new AuthorizationPage();
        authPage.verifyInvalidEmail(TestData.getTestInvalidEmailSpace(),TestData.getErrorEmailValue());
    }

    @AfterMethod
    public void closePage() {
        closeSite();
    }
}
