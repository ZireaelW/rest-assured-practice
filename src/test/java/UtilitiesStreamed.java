import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesStreamed {
    @Test
    public void testUtilitiesStreamed(){
        get("https://postman-echo.com/stream/5").then().statusCode(200);
    }
}
