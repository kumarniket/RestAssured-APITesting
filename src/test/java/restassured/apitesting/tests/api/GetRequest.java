package restassured.apitesting.tests.api;

import org.junit.Test;
import restassured.apitesting.config.TestConfig;
import static io.restassured.RestAssured.given;

public class GetRequest extends TestConfig {

    @Test
    public void OneGetRequest(){
        given()
                .log().all()
        .when()
                .get("/videogame")
        .then()
                .log().all();
    }
}
