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