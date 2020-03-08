import com.jayway.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthDigest {
    @Test
    public void testAuthDigest(){
        given().auth()
                .basic("postman", "postman")
                .header("Authorization","Digest username=\"postman\", realm=\"Users\", nonce=\"ni1LiL0O37PRRhofWdCLmwFsnEtH1lew\", uri=\"/digest-auth\", response=\"254679099562cf07df9b6f5d8d15db44\", opaque=\"\"")
                .when()
                .get("https://postman-echo.com/digest-auth")
                .then()
                .assertThat()
                .statusCode(200);
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.basePath = "/digest-auth";

    }
}
