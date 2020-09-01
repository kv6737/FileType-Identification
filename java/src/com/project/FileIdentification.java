package com.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileIdentification {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();//the input file name should be of the form file_name.file_extension like abc.pdf,abc.txt etc
		String file[] = input.split(".");
		String fileName = file[0];
		String extension = file[1];
		Data data = new Data(fileName, extension);
		System.out.println("Developer " + data.getDeveloper());
	}

}
