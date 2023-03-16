package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.BulkConsumerPaymentPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class BulkConsumerPaymentPageFactory extends UtilFactory {

    public BulkConsumerPaymentPageFactory() throws Exception {
    }

    public void validateBulkConsumerPaymentHeadingVisibility(Boolean expectedCondition){
        String locator = BulkConsumerPaymentPageEnum.XPATH_BULK_CONSUMER_PAYMENT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Bulk Consumer Payment Heading is Displayed as Expected on Bulk Consumer Payment Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Bulk Consumer Payment Heading is not Displayed as Expected on Bulk Consumer Payment Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Bulk Consumer Payment Heading is Displayed Unexpectedly on Bulk Consumer Payment Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Bulk Consumer Payment Heading is not Displayed Unexpectedly on Bulk Consumer Payment Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void uploadExcelFile(String fileName){
        String waitElement = BulkConsumerPaymentPageEnum.XPATH_BULK_CONSUMER_PAYMENT_HEADING.getValue();
        String locator = BulkConsumerPaymentPageEnum.XPATH_FILE_UPLOAD_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(waitElement);
            enterString(locator,fileName);
            scenarioDef.log(Status.PASS,"Uploaded Excel File on the File Upload Field on Bulk Consumer Payment Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Upload Excel File on the File Upload Field on Bulk Consumer Payment Page");
            throw e;
        }
    }

    public void selectScheduledDate(){
        String locator = BulkConsumerPaymentPageEnum.XPATH_SCHEDULED_DATE_FIELD.getValue();
        String currentDate = null;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            currentDate = getCurrentDate();
            enterString(locator,currentDate);
            scenarioDef.log(Status.PASS,"Selected Scheduled Date:"+currentDate+" on Bulk Consumer Payment Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select Scheduled Date:"+currentDate+" on Bulk Consumer Payment Page");
            throw e;
        }
    }

    public void selectAccount(String accountName){
        String locator = BulkConsumerPaymentPageEnum.XPATH_FROM_ACCOUNT_FIELD.getValue();
        String locatorOption = BulkConsumerPaymentPageEnum.XPATH_FROM_ACCOUNT_OPTION_START.getValue()+ accountName +BulkConsumerPaymentPageEnum.XPATH_FROM_ACCOUNT_OPTION_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(locatorOption);
            click(locatorOption);
            scenarioDef.log(Status.PASS,"Selected Account "+ accountName+" on Bulk Consumer Payment Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select Account "+ accountName+" on Bulk Consumer Payment Page");
            throw e;
        }
    }

    public void enterTitle(String textToEnter){
        String locator = BulkConsumerPaymentPageEnum.XPATH_TITLE_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered "+textToEnter+" on Title Field on Bulk Consumer Payment Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+textToEnter+" on Title Field on Bulk Consumer Payment Page");
            throw e;
        }
    }

    public void clickSubmitButton(){
        String locator = BulkConsumerPaymentPageEnum.XPATH_SUBMIT_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Submit Button on Bulk Consumer Payment Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Submit Button on Bulk Consumer Payment Page");
            throw e;
        }
    }

     public void validateRequestSuccessHeadingVisibility(Boolean expectedCondition){
        String locator = BulkConsumerPaymentPageEnum.XPATH_REQUEST_SUCCESS_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            waitForPageLoad();
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Request Created Successfully Heading is Displayed as Expected on Bulk Consumer Payment Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Request Created Successfully Heading is not Displayed as Expected on Bulk Consumer Payment Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Request Created Successfully Heading is Displayed as Unexpected on Bulk Consumer Payment Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Request Created Successfully Heading is not Displayed as Expected on Bulk Consumer Payment Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
