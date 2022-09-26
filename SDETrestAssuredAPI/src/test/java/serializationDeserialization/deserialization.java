package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import practiesPojoClass.EmployeeDetails;

public class deserialization {

public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		
		EmployeeDetails e1 = obj.readValue(new File("./Sample.json"), EmployeeDetails.class);
		
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
	}


}
