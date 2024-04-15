package org.apijson;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.json.Json;

public class JSONCourse {
	
	public static void main(String[] args) throws IOException, ParseException {
	//1. Mention the path of JSON	
		FileReader fileReader = new FileReader("C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\API-Sir-Project\\src\\test\\resources\\ArrayCourses.json");
		
//2. create the object for JSON parserClass	
		JSONParser jsonParser = new JSONParser();
		
//3. Pass the JSON file to fetch the values	
		
		Object parse = jsonParser.parse(fileReader);
		
//4.Convert objects to JSON
		
		JSONObject jsonObject=(JSONObject) parse;
		
		Object name = jsonObject.get("name");
		System.out.println(name);
		Object email = jsonObject.get("email");
		System.out.println(email);
		
// To print all course values	
		JSONObject object = (JSONObject) parse;
		Object allcourses = object.get("courses");
		System.out.println(allcourses);
		
//using JSON array 	 to print one values In index[]
		JSONArray array = (JSONArray) allcourses;
		
		Object plsq = array.get(2);
		System.out.println(plsq);
		
// To print all values using loop
		
		for (int i = 0; i < array.size(); i++) {
			
			Object all = array.get(i);
			System.out.println(all);
			
		}
		}
		
    
    
		
		
		
	}


