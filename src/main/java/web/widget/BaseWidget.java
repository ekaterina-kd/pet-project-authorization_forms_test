package web.widget;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BaseWidget {
    public final By loc;
    public BaseWidget(By locator) {
        loc = locator;
    }
    public void checkText(String expectedText){
        $(loc).shouldHave(Condition.text(expectedText));
    }

    public void shouldBeVisible(){
        $(loc).shouldBe(Condition.visible);
    }

    public void checkColorBackground(String color) {
        $(loc).shouldHave(Condition.cssValue("background-color", color));
    }

    public void checkBorder(String color){
        $(loc).shouldHave(Condition.cssValue("border", color));
    }
}
