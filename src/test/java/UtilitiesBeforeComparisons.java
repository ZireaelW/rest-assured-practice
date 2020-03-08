import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;

public class UtilitiesBeforeComparisons {
    @Test
    public void testUtilitiesBeforeComparisons(){
        given()
                .relaxedHTTPSValidation()
                .param("timestamp", "2016-10-10")
                .param("target", "2017-10-10")
                .when()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));

        RestAssured.baseURI = "https://postman-echo.com/time";
        RestAssured.basePath = "/before?timestamp=2016-10-10&target=2017-10-10";
    }
}
