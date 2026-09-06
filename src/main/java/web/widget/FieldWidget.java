package web.widget;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class FieldWidget extends BaseWidget {

    public FieldWidget(By locator) {
        super(locator);
    }

    public void fill(String value){
        $(loc).sendKeys(value);
    }

    public void checkPlaceholder(String valuePlaceholder) {
        $(loc).shouldHave(attribute("placeholder", valuePlaceholder));
    }

    public void checkValue(String valueValid) {
        $(loc).shouldHave(attribute("value", valueValid));
    }

    public void checkBorderColor(String color){
        $(loc).shouldHave(Condition.cssValue("border-color", color));
    }
}
