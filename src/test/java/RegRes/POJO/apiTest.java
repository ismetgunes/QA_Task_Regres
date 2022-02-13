package RegRes.POJO;

import RegRes.Utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class apiTest {
    @BeforeClass
    public void beforeclass() {
        baseURI = ConfigurationReader.get("reqres_api_url");
    }

    @Test
    public void createUser(){
        Reqres reqres=new Reqres();
        reqres.setName("ismet");
        reqres.setJob("Manager");


        Response response=given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .and().body(reqres)
                .when().post("api/users");

        Assert.assertEquals(response.statusCode(),201);

        Assert.assertEquals(response.path("name"),"ismet");

        Assert.assertEquals(response.path("job"),"Manager");

    }

    @Test
    public void listSingleUser(){
        /**
         * Verify with a path method
         */
        Response response=given().accept(ContentType.JSON).when()
                .get("api/users/2");

        assertEquals(response.statusCode(),200);

        String email=response.path("data.email");
        assertEquals("janet.weaver@reqres.in",email);

        String firstName=response.path("data.first_name");
        assertEquals("Janet",firstName);

        String lastName=response.path("data.last_name");
        assertEquals("Weaver",lastName);

        int id=response.path("data.id");
        assertEquals("2",id);
    }

    @Test
    public void updateUser(){
        Reqres reqres=new Reqres();
        reqres.setName("easmatt");
        reqres.setJob("Master");

        Response response=given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .and().body(reqres)
                .when().put("api/users/2");

        assertEquals(response.statusCode(),200);

        String name=response.path("name");
        assertEquals(name,"easmatt");


    }
}
