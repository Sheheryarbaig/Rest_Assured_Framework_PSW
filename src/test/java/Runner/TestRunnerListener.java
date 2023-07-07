package Runner;

import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.EmailReportFactory;
import UtilitiesFactory.ExtentReportFactory;
import UtilitiesFactory.UtilFactory;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.*;
import java.io.IOException;
import static UtilitiesFactory.ServiceFactory.*;
import static UtilitiesFactory.UtilFactory.features;
import static UtilitiesFactory.UtilFactory.recording;


public class TestRunnerListener implements ITestListener,IExecutionListener {

    ExtentReportFactory extentReport = new ExtentReportFactory();
    EmailReportFactory emailReport = new EmailReportFactory();
    String emailReporting;
    String emailRecipients;

    private final ServiceFactory serviceFactoryInstance = ServiceFactory.getInstance();
    String path = "\\src\\test\\resources\\ExecutionVideo";
    //ATUTestRecorder recorder = new ATUTestRecorder(System.getProperty("user.dir")+"\\src\\test\\resources\\ExecutionVideo","TestVideo-"+datefromat.format(date),false);
    ATUTestRecorder recorder = recording(path);

    public TestRunnerListener() throws Exception {
        extentReport.ExtentReport();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
          serviceFactoryInstance.setBrowser(getParameterValue("browser"));
          emailReporting = getParameterValue("emailReport");
          emailRecipients = getParameterValue("emailRecipients");
//        try {
//            recorder.start();
//        } catch (ATUTestRecorderException e) {
//            throw new RuntimeException(e);
//        }
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
//                getDriver().quit();
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
        try {
            recorder.start();
        } catch (ATUTestRecorderException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extentReport.FlushReport();
            if(getDriver()!=null){
               // getDriver().quit();
                try {
                    recorder.stop();
                } catch (ATUTestRecorderException e) {
                    throw new RuntimeException(e);
                }
            }else if (getAndroidDriver()!=null){
                getAndroidDriver().quit();
//                recorder.stop();
            }else if (getIOSDriver()!=null){
                getIOSDriver().quit();
//                recorder.stop();
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
//            try {
//                recorder.stop();
//            } catch (ATUTestRecorderException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public String getParameterValue(String key){
        return Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(key);
    }
}