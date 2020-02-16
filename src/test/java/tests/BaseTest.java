package tests;

import configuration.Configure;
import extensions.AllureSelenideListener;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.testexperiment.project.Config;
@ExtendWith(AllureSelenideListener.class)
public abstract class BaseTest {
    ApplicationContext factory = new AnnotationConfigApplicationContext(Configure.class);;
    @BeforeAll
    public static void setUp() {
        new Config();
    }
}
