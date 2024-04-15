package org.apijson;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FlightTask {
	public static void main(String[] args) throws IOException, ParseException {
		
		
//1. Mention the path of jSON
		FileReader fileReader = new FileReader("C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Project\\src\\test\\resources\\FlightTest.json");
	
//2. create the object for JSON parser class;		
		JSONParser jsonParser = new JSONParser();
		
//3. pass the JSON file to fetch values
		Object parse = jsonParser.parse(fileReader);
		
//4. convert objects to jSONobjects
		
	JSONObject json = (JSONObject) parse;		
	Object object = json.get("data");			
	JSONObject jsonObject = (JSONObject)object;
			
			System.out.println(" Data: **********   ");
			Object object2 = jsonObject.get("id");
			System.out.println(object2);
			
			Object object3 = jsonObject.get("flightName");
			System.out.println(object3);
			
			Object object4 = jsonObject.get("Country");
			System.out.println(object4);
			
			Object object5 = jsonObject.get("Destinations");
			System.out.println(object5);
			
			Object object6 = jsonObject.get("URL");
			System.out.println(object6);
			
			Object object7 = jsonObject.get("Created_Date");
			System.out.println(object7);
			
			Object object8 = jsonObject.get("Updated_Date");
			System.out.println(object8);
			
			
	        System.out.println("Support: ********   ");
	        
	Object objectA = json.get("support");
	JSONObject jsonObject2=(JSONObject)objectA;
			
			Object object9 = jsonObject2.get("url");
			System.out.println(object9);
			
			Object object10 = jsonObject2.get("text");
			System.out.println(object10);
	
	}
		
}
