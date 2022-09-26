package DefferentwaysTopost;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonObject {
	@Test
	public void createProject() {
		baseURI="http://localhost";
		port=8084;
		// create pre requiries
		JSONObject obj=new JSONObject();
		obj.put("createBy","priyanka");
		obj.put("projectName","sdetp2");
		obj.put("status","on going");
		obj.put("teamsize",10);
		//send request and validate
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
	}

}
