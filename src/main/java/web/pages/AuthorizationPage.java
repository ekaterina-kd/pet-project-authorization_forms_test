package web.pages;

import web.widget.BaseWidget;
import web.Locators;
import web.widget.ButtonWidget;
import web.widget.FieldWidget;


public class AuthorizationPage {

    public ButtonWidget startButton = new ButtonWidget(Locators.AuthPage.START_BUTTON);
    public ButtonWidget formsStartButton = new ButtonWidget(Locators.AuthPage.FORMS_START_BUTTON);

    public BaseWidget loginEmailHeader = new BaseWidget(Locators.AuthPage.LOGIN_EMAIL_HEADER);
    public BaseWidget loginPasswordHeader = new BaseWidget(Locators.AuthPage.LOGIN_PASSWORD_HEADER);
    public FieldWidget loginEmailField = new FieldWidget(Locators.AuthPage.LOGIN_EMAIL_FIELD);
    public FieldWidget loginPasswordField = new FieldWidget(Locators.AuthPage.LOGIN_PASSWORD_FIELD);
    public ButtonWidget loginAuthButton = new ButtonWidget(Locators.AuthPage.LOGIN_AUTH_BUTTON);
    public ButtonWidget loginResetButton = new ButtonWidget(Locators.AuthPage.LOGIN_RESET_BUTTON);

    public BaseWidget loginResult = new BaseWidget(Locators.AuthPage.RESULT_LOGIN);

    public BaseWidget loginErrorEmail = new BaseWidget(Locators.AuthPage.ERROR_REQUIRED_EMAIL);
    public BaseWidget loginErrorPassword = new BaseWidget(Locators.AuthPage.ERROR_REQUIRED_PASSWORD);

    public void verifyInvalidEmail(String invalidEmail, String expectedError){
        loginEmailField.fill(invalidEmail);
        loginAuthButton.click();
        loginErrorEmail.checkText(expectedError);
        loginResetButton.click();
    }

}
