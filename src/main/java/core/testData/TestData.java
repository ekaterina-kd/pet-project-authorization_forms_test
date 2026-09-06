package core.testData;

public class TestData {
    private static final String TEST_EMAIL = "katya@dog.com";
    private static final String TEST_PASSWORD = "12345";
    private static final String PLACEHOLDER_EMAIL = "you@example.com";
    private static final String PLACEHOLDER_PASSWORD = "Enter password";
    private static final String TEST_INVALID_EMAIL_NOT_AT = "katya";
    private static final String TEST_INVALID_EMAIL_DOUBLE_AT = "katya@@dog.com";
    private static final String TEST_INVALID_EMAIL_NOT_DOMAIN = "katya@dog";
    private static final String TEST_INVALID_EMAIL_SPACE = "katya @dog.com";
    private static final String BUTTON_LOGIN_COLOR_BACKGROUND = "rgba(31, 95, 107, 1)";
    private static final String BUTTON_RESET_COLOR_BACKGROUND = "rgba(0, 0, 0, 0)";
    private static final String FIELD_ERROR_COLOR_BORDER = "rgb(255, 95, 86)";
    private static final String RESULT_COLOR_BACKGROUND = "rgba(34, 197, 94, 0.08)";
    private static final String RESULT_COLOR_BORDER = "0.8px solid rgba(34, 197, 94, 0.3)";
    private static final String ERROR_EMAIL_VALUE = "Enter a valid email address.";

    public static String getTestEmail() {
        return TEST_EMAIL;
    }

    public static String getTestPassword() {
        return TEST_PASSWORD;
    }

    public static String getPlaceholderEmail() {
        return PLACEHOLDER_EMAIL;
    }

    public static String getPlaceholderPassword() {
        return PLACEHOLDER_PASSWORD;
    }

    public static String getTestInvalidEmailNotAt() {
        return TEST_INVALID_EMAIL_NOT_AT;
    }

    public static String getTestInvalidEmailDoubleAt() {
        return TEST_INVALID_EMAIL_DOUBLE_AT;
    }

    public static String getTestInvalidEmailNotDomain() {
        return TEST_INVALID_EMAIL_NOT_DOMAIN;
    }

    public static String getTestInvalidEmailSpace() {
        return TEST_INVALID_EMAIL_SPACE;
    }

    public static String getButtonLoginColorBackground() {
        return BUTTON_LOGIN_COLOR_BACKGROUND;
    }

    public static String getButtonResetColorBackground() {
        return BUTTON_RESET_COLOR_BACKGROUND;
    }

    public static String getFieldErrorColorBorder() {
        return FIELD_ERROR_COLOR_BORDER;
    }

    public static String getResultColorBackground() {
        return RESULT_COLOR_BACKGROUND;
    }

    public static String getResultColorBorder() {
        return RESULT_COLOR_BORDER;
    }

    public static String getErrorEmailValue() {
        return ERROR_EMAIL_VALUE;
    }
}
