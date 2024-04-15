package org.taskfile;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeePojoWrite {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
	//1. Mention the path of JSON where to Store
		
		File file=new File("C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Sir-Project\\src\\test\\resources\\writeEmployee.json");
	//2. create the object for objectMapper class;
		
		ObjectMapper mapper = new ObjectMapper();
	//3. Assign the values 
		
		Employee1 emp=new Employee1("Naveen","kumar",9944764047l,"vellore");
		
	mapper.writeValue(file, emp);
		
		
		
		
	}

}
