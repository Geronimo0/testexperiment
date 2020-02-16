package com.testexperiment.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
@Component
public class BasePage {
    protected SelenideElement $_(By by){
        return $(by).shouldBe(Condition.exist, Condition.visible);
    }
}
