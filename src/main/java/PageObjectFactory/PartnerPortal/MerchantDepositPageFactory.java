package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.MerchantDepositPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class MerchantDepositPageFactory extends UtilFactory {

    public MerchantDepositPageFactory() throws Exception {
    }

    public void validateMerchantDepositHeadingVisibility(Boolean expectedCondition){
        String locator = MerchantDepositPageEnum.XPATH_MERCHANT_DEPOSIT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Merchant Deposit Heading is Displayed as Expected on Merchant Deposit Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Merchant Deposit Heading is not Displayed as Expected on Merchant Deposit Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Merchant Deposit Heading is Displayed Unexpectedly on Merchant Deposit Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Merchant Deposit Heading is not Displayed Unexpectedly on Merchant Deposit Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
