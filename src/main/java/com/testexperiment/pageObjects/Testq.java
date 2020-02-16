package com.testexperiment.pageObjects;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Action;

public class Testq {

    @Autowired
    MainPage mainPage;

    @Test
    public void rrr(){
        System.out.println("123");
        mainPage.getAmountOfBlogs();
    }
}
