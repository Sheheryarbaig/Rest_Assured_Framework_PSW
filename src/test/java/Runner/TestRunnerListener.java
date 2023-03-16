package Runner;

import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.EmailReportFactory;
import UtilitiesFactory.ExtentReportFactory;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.*;

import java.io.IOException;

import static UtilitiesFactory.ServiceFactory.*;
import static UtilitiesFactory.UtilFactory.features;


public class TestRunnerListener implements ITestListener,IExecutionListener {

    ExtentReportFactory extentReport = new ExtentReportFactory();
    EmailReportFactory emailReport = new EmailReportFactory();
    String emailReporting;
    String emailRecipients;

    private final ServiceFactory serviceFactoryInstance = ServiceFactory.getInstance();

    public TestRunnerListener() throws Exception {
        extentReport.ExtentReport();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
          serviceFactoryInstance.setBrowser(getParameterValue("browser"));
          emailReporting = getParameterValue("emailReport");
          emailRecipients = getParameterValue("emailRecipients");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        try{
            extentReport.ExtentPassStep();
            if(getDriver()!=null){
                getDriver().quit();
            }else if (getAndroidDriver()!=null){
                getAndroidDriver().quit();
            }else if (getIOSDriver()!=null){
                getIOSDriver().quit();
            } else if (getRequest()!=null){
                setRequest(null);
                setResponse(null);
                setParams(null);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        try{
            extentReport.ExtentFailStep();
            if(getDriver()!=null){
                getDriver().quit();
            }else if (getAndroidDriver()!=null){
                getAndroidDriver().quit();
            }else if (getIOSDriver()!=null){
                getIOSDriver().quit();
            } else if (getRequest()!=null){
                setRequest(null);
                setResponse(null);
                setParams(null);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        features = extentReport.extent.createTest(Feature.class, iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extentReport.FlushReport();
        if(getDriver()!=null){
            getDriver().quit();
        }else if (getAndroidDriver()!=null){
            getAndroidDriver().quit();
        }else if (getIOSDriver()!=null){
            getIOSDriver().quit();
        }else if (getRequest()!=null){
            setRequest(null);
            setResponse(null);
            setParams(null);
        }
    }

    @Override
    public void onExecutionFinish() {
        if (emailReporting.equalsIgnoreCase("on"))
        {
            emailReport.EmailReporter(emailRecipients);
        }
    }

    public String getParameterValue(String key){
        return Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(key);
    }
}