package day19;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		

		for (WebElement d:alllinks)
		{
			String url = d.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("Broken Link");
			}
			URL link = new URL(url);
			
//			try {
//				HttpURLConnection httpCon = (HttpURLConnection)link.openConnection();
//				
//				if (httpCon.getResponseCode()>=400)
//				{
//					System.out.println(httpCon.getResponseCode() + url + " :is broken");
//				}
//				else
//				{
//					System.out.println(httpCon.getResponseCode() + url + " :is valid");
//				}
//			} catch (IOException e) {
//
//			}
			
			
			
		}
		}
}

	

