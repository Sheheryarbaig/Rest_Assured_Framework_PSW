package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.TransactionHistoryPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.util.List;

public class TransactionHistoryPageFactory extends UtilFactory {

    public TransactionHistoryPageFactory() throws Exception {
    }

    public void validateTransactionHistoryHeadingVisibility(Boolean expectedCondition){
        String locator = TransactionHistoryPageEnum.XPATH_TRANSACTION_HISTORY_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction History Heading is Displayed as Expected on Transaction History Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction History Heading is not Displayed as Expected on Transaction History Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction History Heading is Displayed Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction History Heading is not Displayed Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void enterFieldValue(String fieldName,String textToEnter) throws Exception {
        String locator = TransactionHistoryPageEnum.XPATH_FIELD_START.getValue()+ fieldName +TransactionHistoryPageEnum.XPATH_FIELD_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on "+fieldName+" Field on Transaction History Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on "+fieldName+" Field on Transaction History Page");
            throw e;
        }
    }
    public void clickSearchButton(){
        String locator = TransactionHistoryPageEnum.XPATH_SEARCH_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Search Button on Transaction History Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Search Button on Transaction History Page");
            throw e;
        }
    }
    public void selectFieldValue(String fieldName,String textToSelect){
        String locator = TransactionHistoryPageEnum.XPATH_DROPDOWN_FIELD_START.getValue()+ fieldName +TransactionHistoryPageEnum.XPATH_DROPDOWN_FIELD_END.getValue();
        String locatorValue = TransactionHistoryPageEnum.XPATH_DROPDOWN_VALUE_START.getValue()+ textToSelect +TransactionHistoryPageEnum.XPATH_DROPDOWN_VALUE_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(locatorValue);
            click(locatorValue);
            scenarioDef.log(Status.PASS,"Selected: "+textToSelect+" on "+fieldName+" Field on Transaction History Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select: "+textToSelect+" on "+fieldName+" Field on Transaction History Page");
            throw e;
        }
    }

    public void validateTransactionDateHistory(String startDate,String endDate,Boolean expectedCondition) throws ParseException {
        String waitLocator = TransactionHistoryPageEnum.XPATH_LOADER_DIV.getValue();
        String locator = TransactionHistoryPageEnum.XPATH_TRANSACTION_DATE_RECORD.getValue();
        String errorMsg = "No Records were Found for Transaction History on the Table Against the Selected Filter";
        Boolean actualCondition = true;
        List<WebElement> recordElements;
        String recordText;
        String [] splitVal;
        try{
            waitFactory.waitForElementToBeInVisible(waitLocator);
            waitFactory.waitForElementToBeVisible(locator);
            recordElements = elementFactory.getElementsList(locator);
            for (int i=0;i<recordElements.size() && actualCondition;i++){
                recordText = getText(recordElements.get(i));
                splitVal = recordText.split(" ");
                recordText = splitVal[0];
                actualCondition = dateIsInFuture(recordText,startDate) && dateIsInPast(recordText,endDate);
            }
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated All Transaction Record Lies Between "+startDate+" and "+endDate+" as Expected on Transaction History Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated All Transaction Record does not Lie Between "+startDate+" and "+endDate+" as Expected on Transaction History Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction Record Lies Between "+startDate+" and "+endDate+" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction Record does not Lie Between "+startDate+" and "+endDate+" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickResetButton(){
        String locator = TransactionHistoryPageEnum.XPATH_RESET_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Reset Button on Transaction History Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Reset Button on Transaction History Page");
            throw e;
        }
    }

    public void validateStatusHistory(String statusText,Boolean expectedCondition) {
        String waitLocator = TransactionHistoryPageEnum.XPATH_LOADER_DIV.getValue();
        String locator = TransactionHistoryPageEnum.XPATH_STATUS_RECORD.getValue();
        String errorMsg = "No Records were Found for Status on the Table Against the Selected Filter";
        Boolean actualCondition = true;
        List<WebElement> recordElements;
        String recordText;
        try{
            waitFactory.waitForElementToBeInVisible(waitLocator);
            waitFactory.waitForElementToBeVisible(locator);
            recordElements = elementFactory.getElementsList(locator);
            for (int i=0;i<recordElements.size() && actualCondition;i++){
                recordText = getText(recordElements.get(i));
                actualCondition = statusText.equalsIgnoreCase(recordText);
            }
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated All Transaction Record has Status: "+statusText+" as Expected on Transaction History Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated All Transaction Record does not have Status: "+statusText+" as Expected on Transaction History Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction Record has Status: "+statusText+" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction does not have Status: "+statusText+" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateTransactionIdHistory(String transactionId, Boolean expectedCondition) {
        String waitLocator = TransactionHistoryPageEnum.XPATH_LOADER_DIV.getValue();
        String locator = TransactionHistoryPageEnum.XPATH_TRANSACTION_ID_RECORD.getValue();
        String errorMsg = "No Records were Found for Status on the Table Against the Selected Filter";
        Boolean actualCondition;
        String recordText;
        try{
            waitFactory.waitForElementToBeInVisible(waitLocator);
            waitFactory.waitForElementToBeVisible(locator);
            recordText =getText(locator);
            actualCondition = transactionId.equals(recordText);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction Record has Transaction ID: "+ transactionId +" as Expected on Transaction History Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction Record does not have Transaction ID: "+ transactionId +" as Expected on Transaction History Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction Record has Transaction ID: "+ transactionId +" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction does not have Transaction ID: "+ transactionId +" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateWalletIdHistory(String walletId,Boolean expectedCondition) {
        String waitLocator = TransactionHistoryPageEnum.XPATH_LOADER_DIV.getValue();
        String locatorTo = TransactionHistoryPageEnum.XPATH_TO_ACCOUNT_RECORD.getValue();
        String locatorFrom = TransactionHistoryPageEnum.XPATH_FROM_ACCOUNT_RECORD.getValue();
        String errorMsg = "No Records were Found for Status on the Table Against the Selected Filter";
        Boolean actualCondition = true;
        List<WebElement> toRecordElements;
        List<WebElement> fromRecordElements;
        String recordText;
        try{
            waitFactory.waitForElementToBeInVisible(waitLocator);
            waitFactory.waitForElementToBeVisible(locatorFrom);
            toRecordElements = elementFactory.getElementsList(locatorTo);
            fromRecordElements = elementFactory.getElementsList(locatorFrom);
            for (int i=0;i<fromRecordElements.size() && actualCondition;i++){
                recordText = getText(fromRecordElements.get(i));
                actualCondition = walletId.equalsIgnoreCase(recordText);
                if(!actualCondition){
                    recordText = getText(toRecordElements.get(i));
                    actualCondition = walletId.equalsIgnoreCase(recordText);
                }
            }
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated All Transaction Records are either From or To Account: "+walletId+" as Expected on Transaction History Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated All Transaction Record are neither From or To Account: "+walletId+" as Expected on Transaction History Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction Record either From or To Account: "+walletId+" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + toRecordElements);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction Record neither From or To Account: "+walletId+" Unexpectedly on Transaction History Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + toRecordElements);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
