package patterns.builderPatternExmples;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Test {

   /* private static String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"1\" \n}";*/

    @BeforeSuite
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @org.testng.annotations.Test()
    public void postRequest() {
       Payload requestBody = new Payload.PayloadBuilder("Krishna")
               .setbody("Story")
               .setuserId("1").build();

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assert.assertEquals(201, response.statusCode());
        Assert.assertEquals("Krishna", response.jsonPath().getString("title"));
    }

    @org.testng.annotations.Test()
    public void postRequest1() {
        Payload requestBody = new Payload.PayloadBuilder("Krishna")
                .setuserId("1").build();
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assert.assertEquals(201, response.statusCode());
        Assert.assertEquals("Krishna", response.jsonPath().getString("title"));
    }
}