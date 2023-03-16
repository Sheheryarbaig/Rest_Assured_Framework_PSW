package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/FeatureFiles/APIs/ServiceFlows.feature",
        monochrome = true,
        tags = "@check",
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = {"com.cucumber.StepsDefinitions",
        "UtilitiesFactory"})

public class APIsTest extends AbstractTestNGCucumberTests {


}