package org.taskfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrainPojo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
 //1. Mention the path of JSON
		File file = new File("C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Sir-Project\\src\\test\\resources\\train.json");

//2. create the object for an objectMapper Class
		
		ObjectMapper mapper = new ObjectMapper();
		
//3. pass the JSON file to fetch values
		
		Train ref = mapper.readValue(file, Train.class);
		
		String trainname = ref.getTrainname();
		int trainno = ref.getTrainno();		
		String starting = ref.getStarting();
		String ending = ref.getEnding();
		
		ArrayList<String> destinations = ref.getDestinations();
		ArrayList<Object> passDetail = ref.getPassengerDetail();
	
		
		System.out.println(trainno);
		System.out.println(trainname);
		System.out.println(starting);
		System.out.println(ending);
		
		
// to get the destinations details;	
		for (String details : destinations)
		{
			
			System.out.println(details);
			}
				
// to get the passenger details;
		for (Object passref : passDetail) 
		{
		System.out.println(passref);
		
	   }
	   
}
	
	}
	

