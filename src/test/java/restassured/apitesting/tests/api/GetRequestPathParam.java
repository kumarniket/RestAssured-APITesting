package restassured.apitesting.tests.api;

import org.junit.Test;
import restassured.apitesting.config.TestConfig;

import static io.restassured.RestAssured.given;

public class GetRequestQueryParams extends TestConfig {

    @Test
    public void GetRequestQueryParams(){

        given()
                .log().all()
                .pathParam("id", 3)
                .when()
                .get("/videogame/{id}")
                .then()
                .log().all();

    }
}
