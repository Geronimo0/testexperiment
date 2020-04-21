package tests;

import com.testexperiment.project.Config;
import extensions.AllureSelenideListener;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AllureSelenideListener.class)
public abstract class BaseTest {
    @BeforeAll
    public static void setUp() {
        new Config();
    }
}
