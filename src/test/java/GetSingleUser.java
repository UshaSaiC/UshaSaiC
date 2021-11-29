import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.hasToString;

public class GetSingleUser {

    @Test
    public void testGetSingleUser(){
        int id=2;
        String name=given().contentType(ContentType.JSON).pathParam("id",id).
                when().get("https://reqres.in/api/users/{id}").then().
                assertThat().statusCode(200).
                body("data.id", comparesEqualTo(id)).
                body("data.email", hasToString("janet.weaver@reqres.in")).
                and().extract().path("data.first_name");
        System.out.println("Name of the user is : "+name);
    }
}