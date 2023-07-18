package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/FeatureFiles/WebShop/API_Example.feature",
        plugin = {"json:target/cucumber.json", "pretty"},
        monochrome = true,
        glue = {"com.cucumber.StepsDefinitions"}
)*/

@CucumberOptions(
      features ="src/test/resources/FeatureFiles/WebShop/Login.feature",
//      features ="src/test/resources/FeatureFiles/WebShop/EndToEndScenario.feature",
//        features ="src/test/resources/FeatureFiles/WebShop/API.feature",
//   features ="src/test/resources/FeatureFiles/WebShop/API_Example.feature",
//   features ="src/test/resources/FeatureFiles/WebShop/API_feature.feature",

        monochrome = true,
      //  tags = "@PSW",
        plugin = {"json:target/cucumber.json", "pretty"},
        glue = {"com.cucumber.StepsDefinitions",
        "UtilitiesFactory"})

public class KrannichWebShop extends AbstractTestNGCucumberTests {


}