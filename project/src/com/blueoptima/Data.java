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
	protected String description;
	protected String category;
	protected String language;
	protected String paradigm;
	protected String developer;
	protected List<String> associatedApplications;
	Data()
	{
		this.description=new String();
		this.category=new String();
		this.language="NA";
		this.paradigm="NA";
		this.developer=new String();
		this.associatedApplications=new ArrayList<String>();
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
	public List<String> getAssociatedApplications() {
		return this.associatedApplications;
	}
}