import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;

public class UtilitiesBetweenTimesTamps {
    @Test
    public void testUtilitiesBetweenTimesTamps(){
        given()
                .relaxedHTTPSValidation()
                .param("timestamp", "2016-10-10")
                .param("start", "2017-10-10")
                .param("end", "2019-10-10")
                .when()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));

        RestAssured.baseURI = "https://postman-echo.com/time";
        RestAssured.basePath = "/between?timestamp=2016-10-10&start=2017-10-10&end=2019-10-10";
    }
}
