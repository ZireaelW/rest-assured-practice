import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PatchData {
    @Test
    public void testResponseCodeDel() {

        given().urlEncodingEnabled(true)
                .param("text", "This is expected to be sent back as part of response body.")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .then().statusCode(200);
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.basePath = "/patch";
    }
}
