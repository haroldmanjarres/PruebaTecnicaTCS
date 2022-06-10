package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Features/contac.feature",
        glue = ("seleniumgluecode/TestContac")
)
public class TestrunnerContac {
}
