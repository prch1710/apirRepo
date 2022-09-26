package basicCRUDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
@Test
public void deletproject() {
	//step1 create pre requisite
	//step2 send the request
	 Response resp = RestAssured.delete("http://localhost:8084/projects/");
	//step3 validate the response
	System.out.println(resp.getStatusCode());
}
}
