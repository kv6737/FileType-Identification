package file_identifier;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Class1 {

		public static void main(String[] args) {
			/*try
			{
				String html="https://fileinfo.com/filetypes/common";
				Document doc=Jsoup.connect(html).userAgent("Mozilla/5.0").get();
				Elements temp = doc.select("div.cnav").get(0).getElementsByTag("a");
				int i=0;
				for(Element fileList : temp)
				{
					i++;
					System.out.println(i+" "+fileList.text());
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}*/
			try
			{
				String html="https://fileinfo.com/extension/pdf";
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

}

