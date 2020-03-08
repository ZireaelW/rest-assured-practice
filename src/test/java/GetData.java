import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;


public class GetData {
    @Test
    public void testResponseCode() {

        Response resp= RestAssured.get("https://postman-echo.com/get?foo1=bar1&foo2=bar2");

        int code = resp.getStatusCode();
        System.out.println("code is: "+code);

        Assert.assertEquals(code,200);
    }

    @Test
    public void Teste() {
        String uriBase = "https://postman-echo.com/get";
        given()
                .relaxedHTTPSValidation()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get(uriBase)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("headers.host", is("postman-echo.com"))
                .body("args.foo1", containsString("bar"));
    }

}
