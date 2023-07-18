package EnumFactory.WebShop;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static UtilitiesFactory.UtilFactory.loadJSONFile;
import static org.testng.AssertJUnit.assertEquals;

public enum PatchAPI {

    INSTANCE;

    public void performPatchRequest(String url) {
        String jsonFilePath = "src/test/resources/APIsJSONs/Requests/patch_request.json";
        String requestBody = loadJSONFile(jsonFilePath);
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(url);

        // Process the response as per your requirements
        verifySuccessfulResponse(response);
        // Perform any necessary assertions or processing on the response data

        // ...
        // Implement the PATCH API request with the provided requestBody
        // Implement the POST API request with the provided requestBody
    }

    public void verifySuccessfulResponse(Response response) {
        int statusCode = response.getStatusCode();
        assertEquals(201, statusCode);
        if (statusCode == 201) {
            System.out.println("Cool");
        }
    }
}
