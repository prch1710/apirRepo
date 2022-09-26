package DefferentwaysTopost;

import org.testng.annotations.Test;

import POJOLibraries.projectLibray;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingPOJOClass {
@Test
public void createProject() {
	baseURI="http://localhost";
	port=8084;
	//create pre requireis
	
	projectLibray plib=new projectLibray("priya","sde","on going",15);
	//send request and validate
	given()
	.body(plib)
	.contentType(ContentType.JSON)
	.when().post("/addProject").then().log().all();
}
}
