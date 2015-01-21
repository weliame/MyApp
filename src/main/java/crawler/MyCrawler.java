package crawler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class MyCrawler extends WebCrawler {

    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|bmp|gif|jpe?g" 
                                                      + "|png|tiff?|mid|mp2|mp3|mp4"
                                                      + "|wav|avi|mov|mpeg|ram|m4v|pdf" 
                                                      + "|rm|smil|wmv|swf|wma|zip|rar|gz))$");

    /**
     * You should implement this function to specify whether
     * the given url should be crawled or not (based on your
     * crawling logic).
     */
    @Override
    public boolean shouldVisit(Page page, WebURL url) {
           return true;
    }

    /**
     * This function is called when a page is fetched and ready 
     * to be processed by your program.
     */
    @Override
    public void visit(Page page) {          
            String url = page.getWebURL().getURL();
            System.out.println("URL: " + url);

            if (page.getParseData() instanceof HtmlParseData) {
                    HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
                    String html = htmlParseData.getHtml();
                    Document doc = Jsoup.parse(html);
                    Elements redBalls =doc.getElementsByClass("ball_red");
                    String reds = "";
                    for(Element e : redBalls){
                   	 reds =  reds+e.text()+" ";
                    }
                    Elements blueBalls =doc.getElementsByClass("ball_blue");
                    for(Element eb : blueBalls){
                   	 reds =  reds+eb.text()+" ";
                    }
                    Element indexEle = doc.getElementById("change_date");
                    //Set<WebURL> links = htmlParseData.getOutgoingUrls();
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("NO. "+indexEle.text()+" Result: " + reds);
                    writeToFile("NO.: "+indexEle.text()+", Result: " + reds);
                    System.out.println("-------------------------------------------------------------------------------------------");
            }
    }
    
    public void writeToFile(String s){
		try (PrintWriter pWriter = new PrintWriter(new BufferedWriter(new FileWriter( "output/500.txt",
																						true)))) {
			pWriter.println(s);
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
    }
}
