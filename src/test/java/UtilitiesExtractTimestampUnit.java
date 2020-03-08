import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;

public class UtilitiesExtractTimestampUnit {
    @Test
    public void testUtilitiesExtractTimestampUnit(){
        given()
                .relaxedHTTPSValidation()
                .param("timestamp", "2016-10-10")
                .param("unit", "day")
                .when()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));

        RestAssured.baseURI = "https://postman-echo.com/time";
        RestAssured.basePath = "/unit?timestamp=2016-10-10&unit=day";

    }

}
