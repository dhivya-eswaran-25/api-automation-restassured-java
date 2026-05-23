package tests;
import base.BaseTest;
import models.User;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserApiTest extends BaseTest {

    @Test
    public void getUsersShouldReturn200() {
        given()
            .spec(requestSpec)
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200);
    }

    @Test
    public void createUserShouldReturn201() {
        User user = User.builder()
                .name("John")
                .job("SDET")
                .build();

        given()
            .spec(requestSpec)
            .body(user)
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("id", notNullValue());
    }
}
