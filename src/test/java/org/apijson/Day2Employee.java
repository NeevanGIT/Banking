package org.apijson;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Day2Employee {
	
	public static void main(String[] args) throws IOException, ParseException {
		
	
//Mention the path of JSON
		FileReader fileReader = new FileReader(
				"C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Project\\src\\test\\resources\\Day2Data.json");	
		
// create an object for an JSON Parser class

		JSONParser jsonParser = new JSONParser();
		
//Pass JSON file to fetch values
		
		Object parse = jsonParser.parse(fileReader);
		
//Convert objects to JSONObject
		
		JSONObject jsonObject= (JSONObject) parse;
		
		Object object = jsonObject.get("page");
		System.out.println(object);
		Object object2 = jsonObject.get("per_page");
		System.out.println(object2);
		Object object3 = jsonObject.get("total_pages");
		System.out.println(object3);
		
		System.out.println(".*******************");
		
		Object object4 = jsonObject.get("data");
		JSONArray array = (JSONArray) object4;
		
		
		
		
		
	for (int i = 0; i < array.size(); i++) {
		Object object5 = array.get(i);
		JSONObject jsonObject2=(JSONObject) object5;
//		JSONObject jsonObject2 = (JSONObject) object5;
		
		Object idRef = jsonObject2.get("id");
		System.out.println(idRef);
		Object flightName = jsonObject2.get("flightName");
		System.out.println(flightName);
		Object country = jsonObject2.get("Country");
		System.out.println(country);
		Object destination = jsonObject2.get("Destinations");
		System.out.println(destination);
		Object url = jsonObject2.get("URL");
		System.out.println(url);
		
	}
	   System.out.println(".*******************");
	   
	   Object supportTit = jsonObject.get("support");
	   JSONObject json1=(JSONObject)supportTit;
	   
	   Object url1 = json1.get("url");
	   System.out.println(url1);
	   Object text = json1.get("text");
	   System.out.println(text);
	   
	   
	   
	    	
	    		
	}	

}
