package tests;

import com.codeborne.selenide.Selenide;
import com.testexperiment.pageObjects.MainPage;
import com.testexperiment.pageObjects.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoobClubTest extends BaseTest {

//    MainPage mainPage = factory.getBean(MainPage.class);


    @Test
    void linksClick() {
        MainPage mainPage = new MainPage();

        Selenide.open("https://www.noob-club.ru");

        new Menu().goToStart();

        final int amountOfNews =
                mainPage.getAmountOfNews();

        final int amountOfBlogs =
                mainPage.getAmountOfBlogs();
        Assertions.assertAll(
                () -> Assertions.assertTrue(amountOfNews > 0),
                () -> Assertions.assertTrue(amountOfBlogs > 0)
        );
    }
}
