import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateAUser {

    @Test
    public void testCreatingAUserAndValidatingResponseCodeAndLoggingResponseBody() {
        JSONObject json = new JSONObject();
        json.put("name", "test");
        json.put("job", "testing");

        Response response = given().body(json.toJSONString()).contentType(ContentType.JSON).
                when().post("https://reqres.in/api/users").
                then().assertThat().statusCode(201).
                and().extract().response();

        System.out.println("Details of user created : "+response.asPrettyString());

        JsonPath jsonPathEvaluator = response.jsonPath();
        String id = jsonPathEvaluator.get("id");
        System.out.println("ID of user created " + id);
    }

}
