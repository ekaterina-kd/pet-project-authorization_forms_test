package web.widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ButtonWidget extends BaseWidget {

    public ButtonWidget (By locator) {
        super(locator);}

    public void click() {
        $(loc).shouldBe(Condition.visible).click();
    }

    public void hover() {
        $(loc).hover();
    }
}
