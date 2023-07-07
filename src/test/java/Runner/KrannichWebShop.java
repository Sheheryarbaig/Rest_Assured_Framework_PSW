package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//       features ="src/test/resources/FeatureFiles/WebShop/Login.feature",
//      features ="src/test/resources/FeatureFiles/WebShop/EndToEndScenario.feature",
        features ="src/test/resources/FeatureFiles/WebShop/API.feature",

        monochrome = true,
//        tags = "@WebShop",
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = {"com.cucumber.StepsDefinitions",
        "UtilitiesFactory"})

public class KrannichWebShop extends AbstractTestNGCucumberTests {


}