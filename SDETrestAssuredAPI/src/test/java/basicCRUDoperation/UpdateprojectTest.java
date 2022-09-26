package basicCRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateprojectTest {
	@Test
	public void updateproject() {
		//step1 create pre reuisite
		JSONObject obj=new JSONObject();
		obj.put("createBy","priyanka");
		obj.put("projectName", "sdet39p");
		obj.put("status","compeleted");
		obj.put("teamsize",24);
		//step2 send the request
		RequestSpecification req = RestAssured.given();
		
		req.body(obj);
		req.contentType(ContentType.JSON);
		Response res = req.put("http://localhost:8084/projects/ TY_PROJ_001");
		//step 3validate the response
		System.out.println(res.getStatusCode());
	}

}
