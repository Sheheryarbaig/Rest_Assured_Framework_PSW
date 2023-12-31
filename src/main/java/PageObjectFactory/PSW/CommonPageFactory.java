package PageObjectFactory.PSW;

import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;

import org.junit.Assert;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static UtilitiesFactory.PropertyLoaderFactory.convertJsonToFormParameters;
import static io.restassured.RestAssured.given;

public class CommonPageFactory extends UtilFactory {

    public static String EnumDirectory = "EnumFactory.WebShop.*";
    public static String PageName;
    static Response Response;
    static Response POSTResponse;
    static String accessToken;
    static String PSID;
    static String amount;
    public CommonPageFactory() throws Exception {
    }

    //T0 Do Update Screen Name as to Read Properties
    public String removeSpaces(String ScreenName) {
        PageName = ScreenName;
        String propertyFileName = ScreenName.replace(" ","");
        return propertyFileName;
    }
    public String getpropertyName(String fieldProperty) {
        String propertyFileName = fieldProperty.replace(" ",".");
        return propertyFileName;
    }
        public static ExtentReports extent;

        public static ExtentReports getInstance() {
            if (extent == null) {
                ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
                extent = new ExtentReports();
                extent.attachReporter(htmlReporter);
            }
            return extent;
        }

    public void textEnterField(String textToEnter,String Locator,String ScreenName) throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            if(!Locator.equals("XPATH_CHANNEL_REFERENCE_SEARCH")){
                clearField(locator);
            }
            enterString(locator,textToEnter);
            if(locator.contains("pass")){
                scenarioDef.log(Status.PASS,"Entered: "+textToEnter.replaceAll(textToEnter,"****")+" in "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            }else{
                scenarioDef.log(Status.PASS,"Entered: "+getLocatorNameforLog(textToEnter)+" in "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+getLocatorNameforLog(textToEnter)+" on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }

    public void clickButton(String Locator,String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        if(Locator.contains("XPATH_APPLY_SHIPPING")){
            waitFactory.waitForElementToBeClickable(locator);
            Thread.sleep(10000);
        }
        try{
            waitForPageLoad();
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }

    public void JsclickButton(String Locator,String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            jsClick(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.");
            throw e;
        }
    }

    public void validateFieldonScreen(String textToValidate,String Locator,String ScreenName)throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            String actualText = getText(locator);
            Assert.assertEquals(textToValidate,actualText);
            scenarioDef.log(Status.PASS,"Validated: "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Failed to Validate "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }


    public void hoverOnButton(String Locator,String ScreenName) throws ClassNotFoundException, Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeVisible(locator);
            hover(locator);
            scenarioDef.log(Status.PASS,getLocatorNameforLog(Locator) + " is visible " + " on "+PageName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible " + " on "+PageName+" Page.");
            throw e;
        }
    }
    public void validateValueAttributeScreen(String attribute,String textToValidate,String Locator,String ScreenName)throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            String actualText = getAttribute(locator,attribute);
            Assert.assertEquals(textToValidate,actualText);
            scenarioDef.log(Status.PASS,"Validated: "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Failed to Validate "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.");
            throw e;
        }
    }

    public void validateDynamicElementOnScreen(String Locator,String testData, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator)+testData+"')]";
        try{
            waitFactory.waitForElementToBeVisible(locator);
            scenarioDef.log(Status.PASS,getLocatorNameforLog(Locator) + " is visible  on " + ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible  on " + ScreenName+" Page.");
            throw e;
        }
    }

    public void validateElementOnScreen(String Locator, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeVisible(locator);
            scenarioDef.log(Status.PASS,getLocatorNameforLog(Locator) + " is visible  on " + ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible  on " + ScreenName+" Page.");
            throw e;
        }
    }

    public void validateDynamicString(String productNameLocator, String productName, String productPrice, String expectedValue, String ScreenName) throws Exception {
        String Locator = UtilFactory.locatorXpath(ScreenName,productNameLocator)+ productName +"')]" ;
        Locator = Locator + UtilFactory.locatorXpath(ScreenName,productPrice);
        try {
            waitFactory.waitForElementToBeVisible(Locator);
            String actualText = getText(Locator);
            if (actualText.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Dollar Symbol in Product Price " + actualText + " on " + ScreenName + "Page.");
            } else {
                scenarioDef.log(Status.PASS, "Dollar Symbol is not visible in Product Price " + actualText + " on " + PageName);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible  on " + PageName+" Page.");
            throw e;
        }

    }

    public void clickOnDynamicElement(String Locator1, String dynamicData, String Locator2, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName, Locator1) + dynamicData + "')]";
        locator = locator + UtilFactory.locatorXpath(ScreenName, Locator2);
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on " + getLocatorNameforLog(Locator2) + " Field on " + PageName + " Page.");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on " + getLocatorNameforLog(Locator2) + " Field on " + PageName + " Page.");
            throw e;
        }
    }

    public void validateDynamicElementColorOnHover(String Locator1, String dynamicData, String Locator2, String colorToValidate, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName, Locator1) + dynamicData + "')]";
        locator = locator + UtilFactory.locatorXpath(ScreenName, Locator2);
        try {
            waitFactory.waitForElementToBeVisible(locator);
            hover(locator);
            Thread.sleep(5000);
            String actualColor = getCSS(locator,"background-color");
            System.out.println(actualColor);
            Assert.assertEquals(colorToValidate,actualColor);
            scenarioDef.log(Status.PASS, "Validated Color of " + getLocatorNameforLog(Locator2) + " Element on Hovering  at " + PageName + " Page.");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not validate color of " + getLocatorNameforLog(Locator2) + " Element on Hovering  at " + PageName + " Page.");
            throw e;
        }
    }

    public void validatePageURL(String expectedText, String screenName) {
        try {
            validateURL(expectedText);
            scenarioDef.log(Status.PASS, "Navigated to " + PageName + " Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not navigate to " + PageName + " Page");
            throw e;
        }

    }

    public String getElementValue(String Locator,String ScreenName, String Value) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            Value = getText(locator);
            System.out.println(locator);
            if(locator.equals("//*[@id=\"sub-fee-slip-subscriptionFees-data\"]/strong"))
            {
                PSID=Value;
            }
            if(locator.equals("(//*[@id=\"sub-fee-slip-subscriptionFees-data\"])[2]"))
            {
                amount=Value;
                System.out.println(amount);
                amount=convertamount(amount);
            }

            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
        return Value;
    }
    public static String convertamount(String input) {
        // Remove "PKR" and spaces from the input
        String numberString = input.replaceAll("[^0-9]", "");

        // Convert the number string to an integer
        int number = Integer.parseInt(numberString);

        // Calculate the length of the number string
        int length = numberString.length();

        // Determine the number of prefix zeros based on the length
        int prefixZeros = 15 - length-4; // Total length is 15 (2 suffix zeros + 1 for digit + 12 prefix zeros)

        // Create the output string with prefix zeros, number, and suffix zeros
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < prefixZeros; i++) {
            output.append("0");
        }
        output.append(number);
        output.append("00"); // Add two suffix zeros

        return output.toString();
    }



   // [1:08 PM] Muhammed Hamza Shahab

    public static Response GETRequest(String APIUrl) throws IOException
    {
        Response=
                given().
                        when().
                        get(APIUrl);
        ResponseBody body = Response.getBody();
        System.out.println(body.asString());
        System.out.println(Response.getStatusCode() );
        return Response;
    }

    public static void getStatusCode(String code) throws IOException

    {
        int get_response = Response.getStatusCode();
        System.out.println(get_response);
        int status= Integer.parseInt(code);
        System.out.println(status);
        Assert.assertEquals(status, get_response);

    }

    public static Response POSTRequest(String APIUrl, String APIBody) throws Exception
    {
        JSONObject requestBody =  PropertyLoaderFactory.getRequestFile(APIBody);
        // Retrieve the inner JSON object 'data'
        if(APIUrl.equals("http://qa.psw.gov.pk/api/ups/PSID/secure")){
            JSONObject dataObject = (JSONObject) requestBody.get("data");

            // Update the 'psid' value in the 'data' object
            dataObject.put("psid", PSID);
            dataObject.put("transaction_amount", amount);
           // dataObject.put("transaction_amount",amount);
        }

        Response=
                given().
                        header("Content-type", "application/json").
                        header("Authorization", "Bearer " + accessToken).
                        body(requestBody).
                        when().
                        post(APIUrl);
        ResponseBody body = Response.getBody();
        System.out.println(body.asString());
        System.out.println(Response.getStatusCode() );
        return Response;
    }
    public static Response PSWTokenRequest(String APIUrl, String APIBody) throws Exception
    {
        System.out.println(APIUrl);



        JSONObject requestBody =  PropertyLoaderFactory.getRequestFile(APIBody);
        String requestbody = convertJsonToFormParameters(requestBody);
        Response=
                given()
                        .contentType("application/x-www-form-urlencoded; charset=utf-8")
                        .body(requestbody)
                        .when().
                        post(APIUrl);
        String responseBody = Response.getBody().asString();
        accessToken = Response.jsonPath().getString("access_token");
        ResponseBody body1 = Response.getBody();
        System.out.println(body1.asString());
        System.out.println(Response.getStatusCode() );
        return Response;
    }
    public static Response PATCHRequest(String APIUrl, String APIBody) throws Exception
    {
        System.out.println(APIUrl);
        System.out.println(APIBody);
        JSONObject requestBody =  PropertyLoaderFactory.getRequestFile(APIBody);

        Response=
                given().
//                        header("Content-type", "application/json").
        body(requestBody).
                        when().
                        patch(APIUrl);
        ResponseBody body = Response.getBody();
        System.out.println(body.asString());
        System.out.println(Response.getStatusCode() );
        return Response;
    }
    public static Statement ConnectDatabase(String ConnectionString, String username, String Password)
            throws SQLException {
        Statement stmt = null;

        String connectionUrl = "jdbc:sqlserver://" + ConnectionString + ";databaseName=AUTH;user=" + username
                + ";password=" + Password;
        Connection con = DriverManager.getConnection(connectionUrl);
        stmt = con.createStatement();
        if (stmt != null) {
            System.out.println("Connection Sucessfull");
        }
        return stmt;
    }




}
