package file_identifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
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
	private List<String> associatedApplications;
	Data()
	{
		this.description=null;
		this.category=null;
		this.language=null;
		this.paradigm=null;
		this.associatedApplications=new ArrayList<String>();
	}
	public void getter(String fileName,String extension)
	{
		try
		{
			String html="https://fileinfo.com/extension/"+extension;
			Document doc=Jsoup.connect(html).userAgent("Mozilla/5.0").get();
			Elements temp = doc.select("table.headerInfo").get(0).getElementsByTag("tr");
			String dev = temp.get(0).getElementsByTag("td").get(1).text();
			System.out.println(dev);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public void setter()
	{
		
	}
}
public class Class1 {

		public static void main(String[] args)throws IOException {

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String input=br.readLine();//the input file name should be of the form file_name.file_extension like abc.pdf,abc.txt etc
			String file[]=input.split(".");
			String fileName=file[0];
			String extension=file[1];
			Data d=new Data();
			d.getter(fileName,extension);
			
		}

}