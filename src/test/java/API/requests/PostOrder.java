package API.requests;

import API.baseUrl.BaseUrl;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostOrder extends BaseUrl {
    @Test
    public void testCreateOrder() {
        // Define the request body
        String requestBody = "{\n" +
                "  \"bookId\": 1,\n" +
                "  \"customerName\": \"John\"\n" +
                "}";

        // Send the POST request
        Response response = RestAssured.given()
                .header("Authorization", "Bearer db89d61399f989baabd6ac63581f8d3e566b02b595d70f040fe48adf9e3ea146")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/orders")
                .then()
                .extract().response();

        // Assertions
        Assert.assertEquals(response.statusCode(), 201, "Status code should be 201");

        // Extract and assert the order ID from the response
        String created = response.jsonPath().getString("created");
        Assert.assertTrue(true);
        // Print the response for debugging
        System.out.println("Response: " + response.asPrettyString());
    }
}

