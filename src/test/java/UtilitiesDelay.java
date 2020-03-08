import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesDelay {
    @Test
    public void testUtilitiesDelay() {
        get("https://postman-echo.com/delay/2").then().statusCode(200);
    }
}
