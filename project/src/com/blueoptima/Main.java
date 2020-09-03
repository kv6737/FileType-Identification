package com.blueoptima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

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
            System.out.println("Category: " + data.getCategory());
            System.out.println("Associated Applications: ");
            List<String> arr=data.getAssociatedApplications();
            for(int i=1;i<=arr.size();i++)
                System.out.println(i+" "+arr.get(i-1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, String> buildLangMap(){
        HashMap<String, String> map = new HashMap<String, String>();

        try {
            Object obj = new JSONParser().parse(new FileReader("res/languages.json"));
            JSONArray jsonArray = (JSONArray) obj;
            for(Object i : jsonArray) {
                JSONObject temp = (JSONObject) i;
                String lang = (String) temp.get("name");
                JSONArray exts = (JSONArray) temp.get("extensions");
                if(exts != null)
                    for(Object ext : exts)
                        map.put(ext.toString().replace("\\.",""), lang);
            }
//			System.out.println(jsonArray.size());
//			System.out.println(map.size());

        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return map;
    }
}
