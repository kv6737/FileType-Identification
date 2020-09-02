package com.project;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.project.Data;

class source1 extends Data{
	source1(String file_name,String extension)
	{
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
class source3 extends Data
{
	source3()
	{
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
