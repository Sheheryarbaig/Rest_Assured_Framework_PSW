package UtilitiesFactory;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static UtilitiesFactory.UtilFactory.*;

public class Hooks {

    @Before
    public void beforeTest(Scenario scenario) {
       scenarioName=scenario.getName();
        ExtentReports extentReports = new ExtentReports(); // Example creation of ExtentReports instance
        features = extentReports.createTest("Features"); // Example creation of ExtentTest instance
        scenarioDef = features.createNode(scenarioName);
    }
}
