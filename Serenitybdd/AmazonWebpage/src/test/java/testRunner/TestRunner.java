package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/AmazonWebpage.feature",
        glue = "stepDefinitions",
        monochrome = true,
        tags =  "@Scenario2"

)
public class TestRunner {
    }

