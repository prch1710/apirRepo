package DefferentwaysTopost;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateProjectUsingJsonFile {
	@Test
	public void createproject() {
		baseURI="http://localhost";
		port=8084;
		File file=new File("C:\\Users\\PRIYANKA\\eclipse-workspace\\SDETrestAssuredAPI\\DATA.json");
		given()
		.body(file).contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().log().all();
		
		
	}

}
