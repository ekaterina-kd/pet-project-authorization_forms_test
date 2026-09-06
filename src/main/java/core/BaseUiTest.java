package core;

import core.testConfigProvider.TestConfigProvider;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseUiTest {

    public void openSite() {
        open(TestConfigProvider.getUrl());
    }

    public void closeSite() {
        closeWebDriver();
    }
}
