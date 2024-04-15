package org.apijson;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	
	
	public static void main(String[] args) throws IOException, ParseException {
		
							//1. mention the path of jSON
		
		FileReader fileReader = new FileReader("C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Project\\src\\test\\resources\\Employee.json");				
		
                            //2. Create the object for JSON parser class
		
		JSONParser jsonParser= new JSONParser();
		
							//3. pass the JSON file to fetch values
		
		Object parse = jsonParser.parse(fileReader);
		
							//4.convert objects to JSON object
		
		JSONObject jsonObject =(JSONObject)parse;		
		Object object = jsonObject.get("name");
		String string= (String)object;
		System.out.println(string);
		
		
	
		
		
		
	}
}
