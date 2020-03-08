import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesGzipCompressedResp {
    @Test
    public void testUtilitiesGzipCompressedResp(){
        get("https://postman-echo.com/gzip").then().statusCode(200);
    }
}
