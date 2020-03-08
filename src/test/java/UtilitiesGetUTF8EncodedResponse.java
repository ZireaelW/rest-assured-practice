import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesGetUTF8EncodedResponse {
    @Test
    public void testGetUTF8EncodedResponse() {
        get("https://postman-echo.com/encoding/utf8").then().statusCode(200);
    }
}
