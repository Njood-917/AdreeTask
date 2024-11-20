package API.requests;

import API.baseUrl.BaseUrl;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class GetBookId extends BaseUrl {
    @Test
    public void testGetBookId(){
        Response response = RestAssured
                .given()
                .when()
                .get("/books/5")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();

        //Assertions
        Assert.assertEquals(response.statusCode(),200);
        String bookName = response.jsonPath().getString("name");
        Assert.assertEquals(bookName,"Untamed");

        System.out.println("Response: " + response.asPrettyString());
    }
}





