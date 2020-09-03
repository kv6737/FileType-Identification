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

            // Data from sorce1
            Data data1 = new Source1(fileName, extension);
            System.out.println("Developer: " + data1.getDeveloper());
            System.out.println("Description: " + data1.getDescription());
            System.out.println("Category: " + data1.getCategory());
            System.out.println("Associated Applications: ");
            List<String> arr1=data1.getAssociatedApplications();
            for(int i=1;i<=arr1.size();i++)
                System.out.println(i+" "+arr1.get(i-1));

            // Data from source2
            Data data2=new Source2(fileName,extension);
            System.out.println("Developer: " + data2.getDeveloper());
            System.out.println("Description: " + data2.getDescription());
            System.out.println("Category: " + data2.getCategory());
            System.out.println("Associated Applications: ");
            List<String> arr2=data2.getAssociatedApplications();
            for(int i=1;i<=arr2.size();i++)
                System.out.println(i+" "+arr2.get(i-1));

            // Data from source3
            Data data3=new Source3(fileName,extension);
            System.out.println("Developer: " + data3.getDeveloper());
            System.out.println("Description: " + data3.getDescription());
            System.out.println("Category: " + data3.getCategory());
            System.out.println("Associated Applications: ");
            List<String> arr3=data3.getAssociatedApplications();
            for(int i=1;i<=arr3.size();i++)
                System.out.println(i+" "+arr3.get(i-1));

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
