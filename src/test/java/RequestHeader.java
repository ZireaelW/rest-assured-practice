import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RequestHeader {
    @Test
    public void testRequestHeader() {

        given().urlEncodingEnabled(true)
                .header("my-sample-header", "Lorem ipsum dolor sit amet")
                .then().statusCode(201);
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.basePath = "/headers";
    }
}
