import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthBasic {
    @Test
    public void testAuthBasic() {
        given().auth()
                .basic("postman", "password")
                .when()
                .get("https://postman-echo.com/basic-auth")
                .then()
                .assertThat()
                .statusCode(200);
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.basePath = "/basic-auth";

    }
}
