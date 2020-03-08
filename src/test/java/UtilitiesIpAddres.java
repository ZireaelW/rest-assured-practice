import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesIpAddres {
    @Test
    public void testUtilitiesDeflateCompressedResp(){
        get("https://postman-echo.com/ip").then().statusCode(200);
    }
}
