package com.testexperiment.project;

import com.codeborne.selenide.Configuration;

public class Config {
    public Config() {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Geronimo_0\\IdeaProjects\\testexperiment\\src\\test\\java\\resources\\chromedriver.exe");
        Configuration.browser = MyChromeDriver.class.getName();
//        Configuration.startMaximized = true;
//        Configuration.baseUrl = "https://www.noob-club.ru";

    }
}
