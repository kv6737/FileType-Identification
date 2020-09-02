package com.project;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.project.Data;

class Source1 extends Data
{
	Source1(String fileName,String extension)
	{
		this.associatedApplications = new ArrayList<String>();
		try
		{
			String html = "https://fileinfo.com/extension/"+extension;
			Document doc = Jsoup.connect(html).userAgent("Mozilla/5.0").get();
			Elements e1 = doc.select("table.headerInfo").get(0).getElementsByTag("tr");
			this.developer = e1.get(0).getElementsByTag("td").get(1).text();
			Elements e2=doc.select("div.infoBox").get(0).getElementsByTag("p");
			this.description=e2.get(0).text();
			//this.category=
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class source2 extends Data
{
	source2()
	{
		
	}
}
class source3
{
	source3()
	{
		
	}
}
