import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class GetCookies {
    @Test
    public void testStatusCode() {
        get("https://postman-echo.com/cookies").then().statusCode(200);
    }
}
