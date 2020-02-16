package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testexperiment.pageObjects.MainPage;
import com.testexperiment.pageObjects.Menu;
import org.springframework.stereotype.Component;

@Component
public class NoobClubTest extends BaseTest {

//    MainPage mainPage = factory.getBean(MainPage.class);

    @Autowired
    public MainPage mainPage;


    @Test
    void linksClick() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MainPage mainPage = context.getBean("mainPage", MainPage.class);

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
