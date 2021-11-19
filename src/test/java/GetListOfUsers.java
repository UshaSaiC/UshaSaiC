import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.comparesEqualTo;

public class GetListOfUsers {

    @Test
    public void testGetListOfUsersAndValidateStatusCodeAndPerPageCountInBody(){
        given().
        when().get("https://reqres.in/api/users").
        then().assertThat().statusCode(200).
        body("per_page", comparesEqualTo(6));
    }
}
