package basicCRUDoperation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllprojectTest {
	@Test
	public void getproject() {
		
//setp1 pre requisites (changes in global github)
		//step2 send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
		//step3 validate the response
		int expStatus=200;
		int actStatus=resp.getStatusCode();
		Assert.assertEquals(actStatus,expStatus);
	}

}
