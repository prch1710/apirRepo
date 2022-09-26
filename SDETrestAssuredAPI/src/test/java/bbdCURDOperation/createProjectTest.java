package bbdCURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createProjectTest {

	@Test
	public void createProject()
	{
		baseURI="http://localhost";
				port=8084;
		//create pre requiries
		JSONObject obj=new JSONObject();
		obj.put("createBy","priyanka");
		obj.put("projectName","sdetp1");
		obj.put("status","on going");
		obj.put("teamSize",12);
		//send the request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		// validate the response
		
		
	}

}
