import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthHawk {
    @Test
    public void testAuthHawk() {
        given().auth()
                .basic("dh37fgj492je", "werxhqb98rpaxn39848xrunpaw3489ruxnpa98w4rxn")
                .when()
                .then()
                .statusCode(200);
        RestAssured.baseURI = "https://postman-echo.com/auth";
        RestAssured.basePath = "/hawk";
    }
}
