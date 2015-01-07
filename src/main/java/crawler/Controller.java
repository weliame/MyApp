package crawler;

import java.io.File;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

public class Controller {
	
	public static void main(String[] args) throws Exception {
		String crawlStorageFolder = System.getProperty("userdir")
									+ File.separatorChar + "output";
		int numberOfCrawlers = 1;

		CrawlConfig config = new CrawlConfig();
		config.setMaxDepthOfCrawling(2);
		config.setCrawlStorageFolder(crawlStorageFolder);

		/*
		 * Instantiate the controller for this crawl.
		 */
		PageFetcher pageFetcher = new PageFetcher(config);
		RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
		RobotstxtServer robotstxtServer = new RobotstxtServer(	robotstxtConfig,
																pageFetcher);
		try {
			CrawlController controller = new CrawlController(	config,
																pageFetcher,
																robotstxtServer);

			/*
			 * For each crawl, you need to add some seed urls. These are the first URLs that are fetched and then the
			 * crawler starts following links which are found in these pages
			 */
			controller.addSeed("http://kaijiang.500.com/shtml/ssq/03002.shtml");
			// controller.addSeed("http://kaijiang.aicai.com/fcssq");
			// controller.addSeed("http://caipiao.163.com/award/ssq/2015002.html");

			/*
			 * Start the crawl. This is a blocking operation, meaning that your code will reach the line after this only
			 * when crawling is finished.
			 */
			controller.start(MyCrawler.class, numberOfCrawlers);
			// Wait for 30 seconds
		    Thread.sleep(30 * 1000);

		    // Send the shutdown request and then wait for finishing
		    controller.shutdown();
		    controller.waitUntilFinish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
