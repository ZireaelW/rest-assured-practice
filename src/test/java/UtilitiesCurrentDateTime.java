import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesCurrentDateTime {
    @Test
    public void testUtilitiesCurrentDateTime(){
        get("https://postman-echo.com/time/now").then().statusCode(200);
    }
}
