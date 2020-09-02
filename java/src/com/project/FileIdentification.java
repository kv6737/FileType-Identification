package com.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

import com.project.Data;
import com.project.Source1;

public class FileIdentification {

	public static void main(String[] args) {
		try {
			HashMap<String, String> langMap = buildLangMap();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();//the input file name should be of the form file_name.file_extension like abc.pdf,abc.txt etc
			String file[] = input.split("\\.");
			String fileName = input;
			String extension = file[file.length - 1];
			
			Data data = new Source1(fileName, extension);
			System.out.println("Developer: " + data.getDeveloper());
			System.out.println("Description: " + data.getDescription());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static HashMap<String, String> buildLangMap(){
		HashMap<String, String> map = new HashMap<String, String>();
		
		try {
			
			Object obj = new JSONParser().parse(new FileReader("res/languages.json"));
			JSONArray jsonArray = (JSONArray) obj;
			
			System.out.println(jsonArray.size());
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return map;
	}
}
