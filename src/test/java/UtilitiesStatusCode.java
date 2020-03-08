import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesStatusCode {

    @Test
    public void testUtilities() {
        get("https://postman-echo.com/status/200").then().statusCode(200);
    }
}
