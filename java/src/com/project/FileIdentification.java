package com.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import com.project.Data;

public class FileIdentification {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();//the input file name should be of the form file_name.file_extension like abc.pdf,abc.txt etc
			String file[] = input.split("\\.");
			String fileName = file[0];
			String extension = file[1];
			
			Data data = new Data(fileName, extension);
			System.out.println("Developer: " + data.getDeveloper());
			System.out.println("Description: " + data.getDescription());
		} catch (IOException e) {
			e.printStackTrace();
		}
}

}
