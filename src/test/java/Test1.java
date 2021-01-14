import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

class Test1 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
       //.body(/* --> ваша проверка здесь <-- */)
        ;
    }
}