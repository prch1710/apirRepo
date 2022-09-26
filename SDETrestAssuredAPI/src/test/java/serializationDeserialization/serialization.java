package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import practiesPojoClass.EmployeeDetails;

public class serialization {
	
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		EmployeeDetails emp = new EmployeeDetails(1, "Chaitra", 1234, "Banglore", "chaitra@gmail.com");
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./Sample.json"), emp);
	}

}


