package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.TransactionReportPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class TransactionReportPageFactory extends UtilFactory {

    public TransactionReportPageFactory() throws Exception {
    }

    public void validateTransactionReportHeadingVisibility(Boolean expectedCondition){
        String locator = TransactionReportPageEnum.XPATH_TRANSACTION_REPORT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction Report Heading is Displayed as Expected on Transaction Report Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction Report Heading is not Displayed as Expected on Transaction Report Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction Report Heading is Displayed Unexpectedly on Transaction Report Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction Report Heading is not Displayed Unexpectedly on Transaction Report Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
