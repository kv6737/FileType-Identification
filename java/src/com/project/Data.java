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
		this.associatedApplications = new ArrayList<String>();
		try
		{
			String html = "https://fileinfo.com/extension/"+extension;
			Document doc = Jsoup.connect(html).userAgent("Mozilla/5.0").get();
			Elements temp = doc.select("table.headerInfo").get(0).getElementsByTag("tr");
			this.developer = temp.get(0).getElementsByTag("td").get(1).text();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public String getDeveloper() {
		return this.developer;
	}
}