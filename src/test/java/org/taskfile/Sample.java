package org.taskfile;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample{
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Project\\src\\test\\resources\\SingleEmployee.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		Employee e = mapper.readValue(file,Employee.class);	
		String name = e.getName();
		System.out.println(name);








}
	
	
	
	
	}