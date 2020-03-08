import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;

public class UtilitiesTransformCollectionFromFormatV2ToV1 {
    @Test
    public void testUtilitiesLeapYearCheck(){
        given()
                .relaxedHTTPSValidation()
                .param("from", "2")
                .param("to", "1")
                .when()
                .then()
                .statusCode(200)
                .contentType("application/json")
                .body("id", is("7875be4b-917d-4aff-8cc4-5606c36bf418"))
                .body("name", is("Sample Postman Collection"))
                .body("description", is("description  testttttt"))
                .body("order", is("4d9134be-e8bf-4693-9cd7-1c0fc66ae739\",\"141ba274-cc50-4377-a59c-e080066f375e"))
                .body("format", is("[]"))
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));

        RestAssured.baseURI = "https://postman-echo.com/transform";
        RestAssured.basePath = "/collection?from=2&to=1";
    }
}
