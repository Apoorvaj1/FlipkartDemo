package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features/AddToCart.feature",
        glue = {"stepDefinitions","Utils"},
        plugin = {"pretty"},
        monochrome = true,
        dryRun = false,
        publish = false
)

public class TestRunner {
}
