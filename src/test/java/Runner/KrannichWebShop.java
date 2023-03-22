package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/FeatureFiles/WebShop/",
        monochrome = true,
//        tags = "@WEBTest",
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = {"com.cucumber.StepsDefinitions",
                "UtilitiesFactory"})

public class KrannichWebShop extends AbstractTestNGCucumberTests {
}
