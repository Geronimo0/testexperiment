package com.testexperiment.pageObjects;

import com.testexperiment.project.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

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
