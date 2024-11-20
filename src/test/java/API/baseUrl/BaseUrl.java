package API.baseUrl;

import io.restassured.RestAssured;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseUrl {
    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = "https://simple-books-api.glitch.me";
    }

}
