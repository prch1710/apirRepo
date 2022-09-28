package ResponseValidation;

import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers; 
import org.testng.annotations.Test;

public class ResponseTimeValidation {
	@Test
	public void responseTimeValidation()
	{
		//prerequisites
		baseURI = "http://localhost";
		port = 8084;
		
		//Action
		when()
		 .get("/projects")
		 
		
		.then()
		  .assertThat().time(Matchers.lessThan(500l));
		 
		 
	}
}
