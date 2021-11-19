import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateAUser {

    @Test
    public void testCreatingAUserAndValidatingResponseCodeAndLoggingResponseBody() {
         String requestBody = "{\n" +
                "  \"name\": \"test\",\n" +
                "  \"job\": \"testing\" \n}";

        Response response = given().body(requestBody).
                when().post("https://reqres.in/api/users").
                then().assertThat().statusCode(201).
                and().extract().response();
        System.out.println("Details of user created : "+response.asString());
    }

}
