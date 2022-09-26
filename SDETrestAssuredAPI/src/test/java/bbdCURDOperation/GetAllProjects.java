package bbdCURDOperation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjects {
@Test
public void getallproject() {
	baseURI="http://localhost";
	port=8084;
	//create pre reqiries
	//send request
	when()
	.get("/projects")
	.then()
	.assertThat().statusCode(200)
	.log().all();
	// validate response
	
}
}
