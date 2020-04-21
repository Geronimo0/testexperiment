package com.testexperiment.pageObjects;

import com.testexperiment.project.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.page;

public class Menu extends BasePage {
    private By links = By.xpath("//div[@class = 'true-navigation']//a");
    private By startLink = By.xpath("//a[text() = 'Начало']");
    private By blogLink = By.xpath("//a[text() = 'Блоги']");
    private By forumLink = By.xpath("//a[text() = 'Форум']");
    private By storeLink = By.xpath("//a[text() = 'Магазин']");
    private By searchLink = By.xpath("//a[text() = 'Поиск']");

    public MainPage goToStart() {
        $_(startLink).click();
        return page(new MainPage());
    }

    public BlogPage goToBlog() {
        $_(blogLink).click();
        return page(new BlogPage());
    }

    public ForumPage goToForum() {
        $_(forumLink).click();
        return page(new ForumPage());
    }

    public StorePage goToStore() {
        $_(storeLink).click();
        return page(new StorePage());
    }

    public SearchPage goToSearch() {
        $_(searchLink).click();
        return page(new SearchPage());
    }

}
