package EnumFactory.WebShop;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static UtilitiesFactory.UtilFactory.loadJSONFile;
import static org.testng.AssertJUnit.assertEquals;

public enum GetAPI {
    INSTANCE;

    public void performGetRequest(String url) {
        // Implement the GET API request
        Response response = RestAssured.get(url);
        // Process the response as per your requirements
        verifySuccessfulResponse(response);


    }
    public void verifySuccessfulResponse(Response  response) {
        int statusCode = response.getStatusCode();
        assertEquals(200, statusCode);
        if (statusCode==200)
        {
            System.out.println("Cool");
        }
    }


}
