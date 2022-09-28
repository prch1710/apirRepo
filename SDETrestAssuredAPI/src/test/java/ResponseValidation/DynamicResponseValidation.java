package ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {
	@Test
	public void dynamicResponse()
	{
		//pre requistes
		String expData = "TY_PROJ_3035";
		baseURI = "http://localhost";
		port = 8084;
		
		//Action
		Response resp = when()
		                   .get("/projects");
		
		//Validation
		boolean flag = false;
		List<String> pIDs = resp.jsonPath().get("projectId");
		for(String projectID : pIDs)
		{
			if(projectID.equalsIgnoreCase(expData))
			{
				flag = true;
			}
		}
		
		Assert.assertTrue(flag);
		System.out.println("data verfied");
		
		resp.then().log().all();
	}
		}

