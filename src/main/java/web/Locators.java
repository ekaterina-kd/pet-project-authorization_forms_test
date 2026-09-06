package web;

import org.openqa.selenium.By;

public interface Locators {

    static By getDataQa(String id) {
        return By.xpath(".//*[@data-testid='" + id + "']");
    }
    static By getDataClass(String dataClass) {
        return By.xpath(".//*[@class='" + dataClass + "']");
    }
    static By getLabelFor(String label) {
        return By.xpath("//label[@for='" + label + "']");
    }


    interface AuthPage {
        By START_BUTTON = getDataQa("hero-start-practicing");
        By FORMS_START_BUTTON = getDataQa("new-practice-card-forms");

        By LOGIN_EMAIL_FIELD = getDataQa("input-login-email");
        By LOGIN_EMAIL_HEADER = getLabelFor("login-email");
        By LOGIN_PASSWORD_FIELD = By.cssSelector("#login-password");
        By LOGIN_PASSWORD_HEADER = getLabelFor("login-password");
        By LOGIN_AUTH_BUTTON = getDataQa("btn-login-submit");
        By LOGIN_RESET_BUTTON = getDataQa("btn-login-reset");

        By RESULT_LOGIN = getDataQa("result-login");

        By ERROR_REQUIRED_EMAIL = getDataQa("error-login-email");
        By ERROR_REQUIRED_PASSWORD = getDataQa("error-login-password");


    }

}
