package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Features/test.feature",
        glue = ("seleniumgluecode/Testt")
)

public class Testrunner {
}
