package com.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Data
{
	private String description;
	private String category;
	private String language;
	private String paradigm;
	private String developer;
	private List<String> associatedApplications;
	Data(String fileName,String extension)
	{
		this.description=new String();
		this.category=new String();
		this.language=new String();
		this.paradigm=new String();
		this.developer=new String();
		this.associatedApplications = new ArrayList<String>();
		
	}
	public String getCategory()
	{
		return this.category;
	}
	public String getDeveloper() {
		return this.developer;
	}
	public String getDescription() {
		return this.description;
	}
}