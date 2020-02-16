package com.testexperiment.project;

import com.codeborne.selenide.Configuration;
import configuration.Configure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Config {
    public Config(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Geronimo_0\\IdeaProjects\\testexperiment\\src\\test\\java\\resources\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://www.noob-club.ru";

    }
}
