package basicCRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createProjectTest {
	@Test
	public void createprojectTest() {
		//step1 create pre requisite nesery
		JSONObject obj=new JSONObject();
		obj.put("createdBy","priyanka");
		obj.put("projectName","sdet39p");
		obj.put("status","on going");
		obj.put("teamsize",24);
		//step2 send the request
	RequestSpecification request = RestAssured.given();
	request.body(obj);
	request.contentType(ContentType.JSON);
	Response respo = request.post("http://localhost:8084/addProject");
	//step3 validate the response
	System.out.println(respo.getContentType());
	System.out.println(respo.getStatusCode());
	System.out.println(respo.getStatusLine());
	System.out.println(respo.prettyPrint());
	System.out.println(respo.prettyPeek());//prefarid
	System.out.println(respo.asString());
	ValidatableResponse validate = respo.then();//or this prefarid
	System.out.println(validate.log().all());
	}
		
	}


