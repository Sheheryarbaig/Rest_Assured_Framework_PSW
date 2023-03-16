package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/FeatureFiles/WebShop/HomePage.feature",
        monochrome = true,
//        tags = "@WEBTest",
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = {"com.cucumber.StepsDefinitions",
        "UtilitiesFactory"})

public class PartnerPortalTest extends AbstractTestNGCucumberTests {


}