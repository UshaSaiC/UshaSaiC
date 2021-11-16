import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSingleUser {
    /****************************************************************************************************************************************************
     Test Name : testGetSingleUser
     Description : validates single user API gives response status code as 200 and prints the response body
     *****************************************************************************************************************************************************/
    @Test
    public void testGetSingleUser(){
        Response response=given().contentType(ContentType.JSON).pathParam("id",2).
                when().get("https://reqres.in/api/users/{id}").then().assertThat().statusCode(200).and().extract().response();
        System.out.println("response of the get single user API is : "+response.asString());

    }
}
