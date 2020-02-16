package configuration;

import com.testexperiment.pageObjects.MainPage;
import com.testexperiment.project.BasePage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.testexperiment")

public class Configure {
    @Bean
    public BasePage basePage(){
        return new BasePage();
    }
}
