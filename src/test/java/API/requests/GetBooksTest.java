package API.requests;

import API.baseUrl.BaseUrl;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GetBooksTest extends BaseUrl {
    @Test
    public void testGetBooks () {
        Response response = RestAssured
                .given()
                .when()
                .get("/books")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();
        Assert.assertEquals(response.statusCode(),200);
        System.out.println("Response: " + response.asPrettyString());
    }
    }



