package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.LoginPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class LoginPageFactory extends UtilFactory {

    public LoginPageFactory() throws Exception {
    }

    public void clickSignInButton(){
        String locator = LoginPageEnum.XPATH_LOGIN_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Sign In Button on Login Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Sign In Button on Login Page");
            throw e;
        }
    }

    public void enterUsername(String textToEnter){
        String locator = LoginPageEnum.XPATH_USERNAME_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Username Field on Login Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Username Field on Login Page");
            throw e;
        }
    }

    public void enterPassword(String textToEnter){
        String locator = LoginPageEnum.XPATH_PASSWORD_FIELD.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Password Field on Login Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Password Field on Login Page");
            throw e;
        }
    }

    public void validateLoginSuccess(Boolean expectedCondition){
        String locator = LoginPageEnum.XPATH_LOGIN_SUCCESS_TOAST.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated User Successfully Logged In as Expected");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated User did not Successfully Log In as Expected");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated User Successfully Logged In as UnExpected";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated User did not Successfully Log In as UnExpected";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateLogOutSuccess(Boolean expectedCondition){
        String locator = LoginPageEnum.XPATH_LOGIN_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated User Successfully Logged Out as Expected");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated User did not Successfully Logged Out as Expected");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated User Successfully Logged Out as UnExpected";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated User did not Successfully Logged Out as UnExpected";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
