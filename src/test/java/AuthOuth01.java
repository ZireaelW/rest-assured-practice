import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthOuth01 {
    @Test
    public void testAuthOuth01() {
        given().auth()
                .basic("RKCGzna7bv9YD57c", "D+EdQ-gs$-%@2Nu7")
                .when()
                .then()
                .statusCode(200);
        RestAssured.baseURI = "https://postman-echo.com/";
        RestAssured.basePath = "/oauth1";
    }
}
