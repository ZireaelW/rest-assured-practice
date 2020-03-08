import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutData {
    @Test
    public void testResponseCodePost() {
        given().urlEncodingEnabled(true)
                .param("data", "This is expected to be sent back as part of response body.")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .then().statusCode(201);
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.basePath = "/put";
    }


}
