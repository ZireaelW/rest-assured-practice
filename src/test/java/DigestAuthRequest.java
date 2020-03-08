import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class DigestAuthRequest {
    @Test
    public void testDigestAuthRequest() {
        get("https://postman-echo.com/digest-auth").then().statusCode(401);
    }
}
