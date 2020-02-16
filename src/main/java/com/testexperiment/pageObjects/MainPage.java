package com.testexperiment.pageObjects;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import com.testexperiment.project.BasePage;

import static com.codeborne.selenide.Selenide.$$;
@Component
public class MainPage extends BasePage {
    private By newsItem = By.xpath("//div[@class=\"entry first\"]");
    private By blogItem = By.xpath("//ul[@class = 'blogs']/li");

    public int getAmountOfNews() {
        return $$(newsItem).size();
    }

    public int getAmountOfBlogs() {
        return $$(blogItem).size();
    }


}
