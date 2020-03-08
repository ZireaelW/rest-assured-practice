import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PostData {
    @Test
    public void testResponseCodePost() {
            given()
                    .relaxedHTTPSValidation()
                    .param("foo1", "bar1")
                    .param("foo2", "bar2")
                    .when()
                    .then()
                    .statusCode(200)
                    .contentType(ContentType.JSON)
                    .body("headers.host", is("postman-echo.com"))
                    .body("args.foo1", containsString("bar"));

                RestAssured.baseURI = "https://postman-echo.com";
                RestAssured.basePath = "/post";
    }
}
