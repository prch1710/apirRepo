package DefferentwaysTopost;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingHasmap {
	@Test
	public void createproject() {
		baseURI="http://localhost";
		port=8084;
		HashMap map=new HashMap();
		map.put("createBy","priya");
		map.put("projectName","sdetp3");
		map.put("status","completed");
		map.put("teamsize",45);
	//send request
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
		
		
	}

}
