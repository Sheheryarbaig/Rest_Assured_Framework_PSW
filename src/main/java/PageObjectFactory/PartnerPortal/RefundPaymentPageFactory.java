package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.RefundPaymentPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class RefundPaymentPageFactory extends UtilFactory {

    public RefundPaymentPageFactory() throws Exception {
    }

    public void validateRefundPaymentHeadingVisibility(Boolean expectedCondition){
        String locator = RefundPaymentPageEnum.XPATH_REFUND_PAYMENT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Refund Payment Heading is Displayed as Expected on Refund Payment Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Refund Payment Heading is not Displayed as Expected on Refund Payment Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Refund Payment Heading is Displayed Unexpectedly on Refund Payment Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Refund Payment Heading is not Displayed Unexpectedly on Refund Payment Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
