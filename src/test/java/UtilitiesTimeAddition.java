import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;

public class UtilitiesTimeAddition {
    @Test
    public void testUtilitiesTimeAddition() {
        given()
                .relaxedHTTPSValidation()
                .param("timestamp", "2016-10-10")
                .param("years", "100")
                .when()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));

        RestAssured.baseURI = "https://postman-echo.com/time";
        RestAssured.basePath = "/add?timestamp=2016-10-10&years=100";
    }
}
