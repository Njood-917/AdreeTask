package API.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatchOrder {
    @Test
    public void UpdateOrder(){

    String requestBody = """
            {
                "customerName": "Melo"
            }
        """;

    Response response = RestAssured.given()
            .header("Authorization", "Bearer db89d61399f989baabd6ac63581f8d3e566b02b595d70f040fe48adf9e3ea146")
            .header("Content-Type", "application/json")
            .body(requestBody)
            .when()
            .patch("/orders/{orderId}", "qSMRHAgMEL18LWabl7b1z")
            .then()
            .assertThat()
            .statusCode(204)
            .extract().response();


        System.out.println("Response: " + response.asPrettyString());
}
}
