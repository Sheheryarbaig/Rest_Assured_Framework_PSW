package PageObjectFactory.APIs;

import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.*;

public class APIsBaseFactory extends UtilFactory{

    public APIsBaseFactory() throws Exception {
    }

    public void setBaseURL(String baseURL){
        RestAssured.baseURI = baseURL;
        ServiceFactory.setRequest(RestAssured.given());
    }

    public void setHeader(String header){
        String headersArray[] = header.split(",");
        for (int i = 0; i< headersArray.length; i++){
            ServiceFactory.getRequest().header(headersArray[i].split(":")[0], headersArray[i].split(":")[1]);
        }
    }

    public JSONObject setJSONParameter(JSONObject requestBody, String parameter){
        if(parameter!=null){
            String paramValues[] = parameter.split(",");
            for(int i=0;i<paramValues.length;i++){
                requestBody.replace(paramValues[i].split(":")[0],paramValues[i].split(":")[1]);
            }
        }
        return requestBody;
    }

    public JSONObject setBuildNumber(JSONObject requestBody, String parameter){
        requestBody.put("buildNumber",parameter);
        return requestBody;
    }

    public Response postRequest(String path, JSONObject body){
        ServiceFactory.setResponse(ServiceFactory.getRequest().body(body).post(path));
        return ServiceFactory.getResponse();
    }

    public Map getAttributeFromResponse(Response response, String attributes) throws ParseException {
        Map<String, String> fetchedAttributes = new HashMap<>();
        String[] keyValues=attributes.split(",");
        JSONObject actualResponse = responseToJSONObject(response);
        for (int i=0;i< keyValues.length;i++){
            fetchedAttributes.put(keyValues[i],JsonPath.from(actualResponse.toString()).get(keyValues[i]).toString());
        }
        return fetchedAttributes;
    }

    public String getRequestWithBearerToken(String path,String attributeValue){
        ServiceFactory.getRequest().header("Authorization", "Bearer " + attributeValue);
        ServiceFactory.setResponse(ServiceFactory.getRequest().get(path));
        return ServiceFactory.getResponse().asString();
    }

    public void validateResponse(Response response,JSONObject expectedResponse,String parameter,String responsePath) throws ParseException {
        String errorMsg=null;
        JSONObject actualResponse = responseToJSONObject(response);
        List<String> temp = Arrays.asList(parameter.split("\\."));
        try{
//            if(compareJsonObjects(actualResponse,expectedResponse,temp,"")){
//                scenarioDef.log(Status.PASS,"<details><summary><b> <font color=green> Validated API \""+responsePath+"\" Response </font></b></summary>" +
//                        "Response: "+actualResponse+"</details>");
//            }else{
//                errorMsg = "<details><summary><b> <font color=red> Could not Validate API \""+responsePath+"\" Response </font></b></summary>Expected Response: "+expectedResponse+"" +
//                        "<br>Actual Response: "+actualResponse+"</details>";
//                throw new JSONException("Actual and Expected Value Differ");
//            }
        }catch (JSONException e){
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }
}
