import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.comparesEqualTo;

public class GetListOfUsers {

    @Test
    public void testGetListOfUsers(){
        int pageNo=1;
        Response response=given().contentType(ContentType.JSON).queryParam("page",pageNo).
                when().get("https://reqres.in/api/users").
                then().assertThat().statusCode(200).
                body("data", hasSize(6)).
                body("per_page", comparesEqualTo(6)).
                and().extract().response();
        System.out.println("response of the list of users API is : "+response.asString());

    }
}
