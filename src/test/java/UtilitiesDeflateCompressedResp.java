import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class UtilitiesDeflateCompressedResp {
    @Test
    public void testUtilitiesDeflateCompressedResp(){
        get("https://postman-echo.com/deflate").then().statusCode(200);
    }
}
